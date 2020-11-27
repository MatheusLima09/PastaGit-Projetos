package com.company;

import com.company.JanelaDoJogo.PedraPapelTesoura;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Pedra,papel e tesoura");
        //anotem a linha abaixo
        tela.setContentPane(new PedraPapelTesoura().getPanelPedraPapelETesoura());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
