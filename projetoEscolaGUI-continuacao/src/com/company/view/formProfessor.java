package com.company.view;

import com.company.dao.AlunoDao;
import com.company.dao.ProfessorDao;
import com.company.model.Professor;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
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
    private JTextField textEndereco;

    public formProfessor(){

        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Professor professor = new Professor();
                professor.setCpf(Integer.parseInt(textCPF.getText()));
                professor.setRg(textRG.getText());
                professor.setNome(textNome.getText());
                professor.setEmail(textEmail.getText());
                professor.setTelefone(textTelefone.getText());
                professor.setEndereco(textEndereco.getText());

                ProfessorDao dao = new ProfessorDao();
                try {
                    dao.inserirDado(professor);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Erro \n" + ex.toString(),
                            "Erro ao cadastrar professor",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }

                    JOptionPane.showMessageDialog(
                            null,
                            "Dados do professor" + professor.toString(),
                            "Cadastro realizado com sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTela();
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
    }
}


