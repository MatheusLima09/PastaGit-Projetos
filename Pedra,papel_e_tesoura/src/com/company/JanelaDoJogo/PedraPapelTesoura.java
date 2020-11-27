package com.company.JanelaDoJogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PedraPapelTesoura {
    private JPanel panelJogo;
    private JLabel lblMensagemDeJogo;
    private JLabel lblJogadaJ2;
    private JLabel lblJogadaJ1;
    private JButton btnPedra;
    private JButton btnTesoura;
    private JButton btnPapel;

    public JPanel getPanelPedraPapelETesoura() {
        return panelJogo;
    }

    public PedraPapelTesoura() {

        btnPedra.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblJogadaJ1.setText("Pedra");
                int a;
                Random ale = new Random();
                a = ale.nextInt(3);
                switch (a) {
                    case 0:
                        lblJogadaJ2.setText("Pedra");
                        lblMensagemDeJogo.setText("Empate");
                        break;
                    case 1:
                        lblJogadaJ2.setText("Papel");
                        lblMensagemDeJogo.setText("Ponto para o jogador 2");
                        break;
                    case 2:
                        lblJogadaJ2.setText("Tesoura");
                        lblMensagemDeJogo.setText("Ponto para o jogador 1");
                        break;
                }
            }
        });

        btnPapel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblJogadaJ1.setText("Papel");
                int a;
                Random ale = new Random();
                a = ale.nextInt(3);
                switch (a) {
                    case 0:
                        lblJogadaJ2.setText("Pedra");
                        lblMensagemDeJogo.setText("Ponto para o jogador 1");
                        break;
                    case 1:
                        lblJogadaJ2.setText("Papel");
                        lblMensagemDeJogo.setText("Empate");
                        break;
                    case 2:
                        lblJogadaJ2.setText("Tesoura");
                        lblMensagemDeJogo.setText("Ponto para o jogador 2");
                        break;
                }
            }
        });

        btnTesoura.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblJogadaJ1.setText("Tesoura");
                int a;
                Random ale = new Random();
                a = ale.nextInt(3);
                switch (a) {
                    case 0:
                        lblJogadaJ2.setText("Pedra");
                        lblMensagemDeJogo.setText("Ponto para o jogador 2");
                        break;
                    case 1:
                        lblJogadaJ2.setText("Papel");
                        lblMensagemDeJogo.setText("Ponto para o jogador 1");
                        break;
                    case 2:
                        lblJogadaJ2.setText("Tesoura");
                        lblMensagemDeJogo.setText("Empate");
                        break;
                }
            }
        });
    }
}