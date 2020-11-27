package com.company.view;

import com.company.dao.DisciplinaDao;
import com.company.dao.ProfessorDao;
import com.company.model.Disciplina;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class formDisciplina {
    private JButton gravarButton;
    private JButton sairButton;
    private JTextField textID;
    private JTextField textNome;
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

                DisciplinaDao dao = new DisciplinaDao();
                try {
                    dao.inserirDado(disciplina);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Erro \n" + ex.toString(),
                            "Erro ao cadastrar disciplina",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }

                    JOptionPane.showMessageDialog(
                            null,
                            "Dados do professor" + disciplina.toString(),
                            "Cadastro realizado com sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTela();
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
    }
}
