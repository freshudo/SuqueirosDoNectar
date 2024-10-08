package com.mycompany.nectardaserra.entity;

public class Avaliacao {
    private String usuario;
    private String suco;
    private String comentario;
    private float nota;
    
    public Avaliacao(String usuario, String suco, float nota,  String comentario){
        this.usuario = usuario;
        this.suco = suco;
        this.comentario = comentario;
        this.nota = nota;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSuco() {
        return suco;
    }

    public String getComentario() {
        return comentario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
