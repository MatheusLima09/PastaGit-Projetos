package com.company.dao;

import com.company.model.Aluno;
import com.company.model.Disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DisciplinaDao {

    //	conectando
    Connection con	=	new	ConnectionFactory().getConnection();

    public void inserirDado(Disciplina disciplina) throws SQLException {
        //Preparando o Statement
        String	sql	=	"insert	into disciplina"	+
                "	(id, nome, descricao)"	+
                "	values	(?,?,?)";
        PreparedStatement stmt	=	con.prepareStatement(sql);

        //preenche valores
        stmt.setInt(1, disciplina.getID());
        stmt.setString(2, disciplina.getNome());
        stmt.setString(3, disciplina.getDescricao());

        //executa
        stmt.execute();
        stmt.close();

    }
}
