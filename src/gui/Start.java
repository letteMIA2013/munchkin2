package gui;

import gui.bilder.PlaySound;

// Created by Bundesmann on 05.06.14.

public class Start {
    public static void main(String[] args) {
        //Login login= new Login();
        new Namenbildschrim();
        PlaySound.playSound("WW.mp3");
    }
}
