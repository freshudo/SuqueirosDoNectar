package com.mycompany.nectardaserra;

import com.mycompany.nectardaserra.pages.JuiceScreen;
import com.mycompany.nectardaserra.service.DataBase;

public class NectarDaSerra {

    public static void main(String[] args) {
        JuiceScreen screen = new JuiceScreen();
        DataBase.readData();
        screen.setVisible(true);
    }
}
