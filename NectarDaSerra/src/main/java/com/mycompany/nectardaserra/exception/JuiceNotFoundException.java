package com.mycompany.nectardaserra.exception;

import javax.swing.JOptionPane;

public class JuiceNotFoundException extends Exception {
    public JuiceNotFoundException() {
        JOptionPane.showMessageDialog(null, "Suco não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}