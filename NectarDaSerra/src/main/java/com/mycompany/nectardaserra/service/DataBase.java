package com.mycompany.nectardaserra.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.mycompany.nectardaserra.entity.Avaliacao;
import com.mycompany.nectardaserra.exception.JuiceNotFoundException;
import com.mycompany.nectardaserra.exception.NotaInvalidaException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataBase {
    private static ArrayList<String> usuarios = new ArrayList<>();
    private static ArrayList<Avaliacao> avas = new ArrayList<>();
    private static HashMap<String, String> idToJuice = new HashMap<String,String>();

    public static void readData() {
        readJuices();
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if(parts.length == 1){
                    usuarios.add(parts[0]);
                }else if(parts.length > 0){
                    float nota = Float.parseFloat(parts[2]);
                    Avaliacao a = new Avaliacao(parts[0], parts[1], nota, parts[3]);
                    avas.add(a);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<String> usuarios) {
        DataBase.usuarios = usuarios;
    }

    public static ArrayList<Avaliacao> getAvas() {
        return avas;
    }

    public static void setAvas(ArrayList<Avaliacao> avas) {
        DataBase.avas = avas;
    }

    public static void addUsuario(String s){
        if(!s.equals("")){
            usuarios.add(s);
        }
    }

    public static void addAva(Avaliacao a){
        avas.add(a);
    }

    public static ArrayList<Avaliacao> readAvas(String s, boolean suqueiro){
        ArrayList<Avaliacao> aux = new ArrayList<Avaliacao>();
        for(int i=0; i<avas.size(); i++){
            Avaliacao a = avas.get(i);
            if(suqueiro && a.getUsuario().equals(s)){
                aux.add(a);
            }else if(!suqueiro && a.getSuco().equals(s)){
                aux.add(a);
            }
        }
        return aux;
    }

    public static String juiceName(String index){
        return idToJuice.get(index);
    }

    public static void foundJuice(String index) throws JuiceNotFoundException{
        if(!idToJuice.containsKey(index)){
            throw new JuiceNotFoundException();
        }
    }

    public static void notaInvalida(String nota) throws NotaInvalidaException{
        try {
            Float.parseFloat(nota);
        } catch (NumberFormatException e) {
            throw new NotaInvalidaException();
        }
    }

    public static float calcMedia(ArrayList<Avaliacao> a){
        float sum = 0;
        for(int i=0; i<a.size(); i++){
            Avaliacao b = a.get(i);
            sum += b.getNota();
        }
        return sum/a.size();
    }

    public static void readJuices(){
        idToJuice.put("101", "Tangerina natural");
        idToJuice.put("103", "Acerola e laranja");
        idToJuice.put("104", "Caqui e laranja");
        idToJuice.put("105", "Cenoura e laranja");
        idToJuice.put("107", "Goiaba e laranja");
        idToJuice.put("109", "Frutas com laranja");
        idToJuice.put("110", "Mamão e laranja");
        idToJuice.put("111", "Manga e laranja");
        idToJuice.put("112", "Morango e laranja");
        idToJuice.put("114", "Abacaxi, hortelã e laranja");
        idToJuice.put("115", "Acerola, beterraba, cenoura e laranja");
        idToJuice.put("116", "Kiwi, maçã, hortelã e laranja");
        idToJuice.put("118", "Maçã, cenoura e laranja");
        idToJuice.put("120", "Maçã, maracujá e laranja");
        idToJuice.put("121", "Melancia");
        idToJuice.put("125", "Melão, abacaxi, gengibre e laranja");    
        idToJuice.put("126", "Mamão, banana e laranja");
        idToJuice.put("127", "Mamão, abacaxi, banana e laranja");
        idToJuice.put("128", "Morango, abacaxi e laranja");
        idToJuice.put("129", "Morango, goiaba e laranja");
        idToJuice.put("130", "Morango, kiwi e laranja");
        idToJuice.put("131", "Mamão, framboesa e laranja");
        idToJuice.put("132", "Pêra, maracujá e laranja");
        idToJuice.put("134", "Manga, maracujá e laranja");
        idToJuice.put("136", "Framboesa, amora e laranja");
        idToJuice.put("137", "Mamão, maracujá e laranja");
        idToJuice.put("138", "Pêra, abacaxi e laranja");
        idToJuice.put("146", "Abacaxi, amora e laranja");
        idToJuice.put("193", "Abacaxi, beterraba e laranja");
        idToJuice.put("195", "Suco de uva natural");
        idToJuice.put("156", "Agrião, hortelã, couve, mel e limão");
        idToJuice.put("157", "Rúcula, agrião, brocolis, mel e laranja");
        idToJuice.put("148", "Maçã verde, maçã fuji, couve, abacaxi, hortelã, e água de côco");
    }
}
