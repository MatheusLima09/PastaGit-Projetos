package com.company.view;

import com.company.model.Professor;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;

public class formProfessor {
    private JPanel professorPanel;
    private JButton gravarButton;
    private JButton sairButton;
    private JTextField textCPF;
    private JTextField textRG;
    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textTelefone;
    private JCheckBox emdsCheckBox;
    private JCheckBox emiaCheckBox;
    private JCheckBox eminfoCheckBox;
    private JCheckBox emadCheckBox;
    private JTextField textEndereco;

    public formProfessor(){

        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Professor professor = new Professor();
                professor.setCpf(Integer.parseInt(textCPF.getText()));
                professor.setRg(Integer.parseInt(textRG.getText()));
                professor.setNome(textNome.getText());
                professor.setEmail(textEmail.getText());
                professor.setTelefone(Integer.parseInt(textTelefone.getText()));
                professor.setEndereco(textEndereco.getText());

                if(emdsCheckBox.isSelected()){
                    professor.setTurmas_emds("sim");
                }

                if(emiaCheckBox.isSelected()){
                    professor.setTurmas_emia("sim");
                }

                if(eminfoCheckBox.isSelected()){
                    professor.setTurmas_eminfo("sim");
                }

                if(emadCheckBox.isSelected()){
                    professor.setTurmas_emad("sim");
                }

                if(professor.getTurmas_emad().equals("não") && professor.getTurmas_emds().equals("não")
                && professor.getTurmas_emia().equals("não") && professor.getTurmas_eminfo().equals("não")){

                    JOptionPane.showMessageDialog(
                            null,
                            "Cada professor precisa lecionar ao menos uma turma",
                            "Cadastro não realizado",
                            JOptionPane.WARNING_MESSAGE
                    );

                }else{

                    JOptionPane.showMessageDialog(
                            null,
                            "Dados do professor" + professor.toString(),
                            "Cadastro realizado com sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTela();
                }
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                formMenu.telaProfessor.dispose();
            }
        });
    }

    public JPanel getProfessorPanel() {
        return professorPanel;
    }

    public void limparTela(){
        textCPF.setText("");
        textRG.setText("");
        textNome.setText("");
        textEmail.setText("");
        textEndereco.setText("");
        textTelefone.setText("");

        emdsCheckBox.setSelected(false);
        emiaCheckBox.setSelected(false);
        eminfoCheckBox.setSelected(false);
        emadCheckBox.setSelected(false);
    }
}


