package com.company.dao;

import com.company.model.Aluno;
import com.company.model.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {

    Connection con = new ConnectionFactory().getConnection();

    public void inserirDado(Professor professor) throws SQLException {
        //Preparando o Statement
        String	sql	=	"insert	into professor"	+
                "	(cpf, rg, nome, email, telefone, endereco)"	+
                "	values	(?,?,?,?,?,?)";
        PreparedStatement stmt	=	con.prepareStatement(sql);

        //preenche valores
        stmt.setInt(1, professor.getCpf());
        stmt.setString(2,professor.getRg());
        stmt.setString(3, professor.getNome());
        stmt.setString(4, professor.getEmail());
        stmt.setString(5, professor.getTelefone());
        stmt.setString(6, professor.getEndereco());

        //executa
        stmt.execute();
        stmt.close();
    }
}
