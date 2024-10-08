package com.mycompany.nectardaserra.exception;

import javax.swing.JOptionPane;

public class NotaInvalidaException extends Exception {
    public NotaInvalidaException() {
        JOptionPane.showMessageDialog(null, "Nota inválida", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}