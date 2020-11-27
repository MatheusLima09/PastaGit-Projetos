package com.company.view;

import com.company.model.Disciplina;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formDisciplina {
    private JButton gravarButton;
    private JButton sairButton;
    private JTextField textID;
    private JTextField textNome;
    private JCheckBox emdsCheckBox;
    private JCheckBox emiaCheckBox;
    private JCheckBox eminfoCheckBox;
    private JCheckBox emadCheckBox;
    private JTextArea textAreaDescricao;
    private JPanel disciplinaPanel;

    public formDisciplina(){

        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Disciplina disciplina = new Disciplina();
                disciplina.setID(Integer.parseInt(textID.getText()));
                disciplina.setNome(textNome.getText());
                disciplina.setDescricao(textAreaDescricao.getText());

                if(emdsCheckBox.isSelected()){
                    disciplina.setCurso_emds("sim");
                }

                if(emiaCheckBox.isSelected()){
                    disciplina.setCurso_emia("sim");
                }

                if(eminfoCheckBox.isSelected()){
                    disciplina.setCurso_eminfo("sim");
                }

                if(emadCheckBox.isSelected()){
                    disciplina.setCurso_emad("sim");
                }

                if(disciplina.getCurso_emad().equals("não") && disciplina.getCurso_emds().equals("não")
                        && disciplina.getCurso_emia().equals("não") && disciplina.getCurso_eminfo().equals("não")){

                    JOptionPane.showMessageDialog(
                            null,
                            "No mínimo uma turma precisa ter essa matéria",
                            "Cadastro não realizado",
                            JOptionPane.WARNING_MESSAGE
                    );

                }else{

                    JOptionPane.showMessageDialog(
                            null,
                            "Dados do professor" + disciplina.toString(),
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
                formMenu.telaDisciplina.dispose();
            }
        });
    }

    public JPanel getDisciplinaPanel(){
        return disciplinaPanel;
    }

    public void limparTela(){
        textID .setText("");
        textNome.setText("");
        textAreaDescricao.setText("");

        emdsCheckBox.setSelected(false);
        emiaCheckBox.setSelected(false);
        eminfoCheckBox.setSelected(false);
        emadCheckBox.setSelected(false);
    }
}
