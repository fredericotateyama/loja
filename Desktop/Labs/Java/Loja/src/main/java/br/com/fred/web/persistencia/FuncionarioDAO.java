package br.com.fred.web.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fred.web.entidade.Funcionario;

public class FuncionarioDAO {

	Connection conexao = ConnectionFactory.getConnection();
	
	public void cadastrarFuncionario(Funcionario func){
		String sql = "INSERT INTO FUNCIONARIO (CPF_FUNCIONARIO, NOME_FUNCIONARIO, CARGO_FUNCIONARIO) VALUE(?,?,?)";
		try {
			PreparedStatement stmt  = conexao.prepareStatement(sql);
			stmt.setString(1, func.getNome());
			stmt.setString(2, func.getCpf());
			stmt.setString(3, func.getCargo());
			stmt.execute();
			stmt.close();
			
			System.out.println("Funcionário cadastrado com sucesso..");
		  } 
		catch (SQLException e) {
		throw new RuntimeException(e);
		}
	}
	
	public void atualizaFuncionario(Funcionario func){
		String sql = "UPDATE FUNCIONARIO SET CPF_FUNCIONARIO=?, NOME_FUNCIONARIO=?, CARGO_FUNCIONARIO=? WHERE ID_FUNCIONARIO=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			  stmt.setString(1, func.getCpf());
			  stmt.setString(2, func.getNome());
			  stmt.setString(3, func.getCargo());
			  stmt.setInt(4, func.getId());
			  stmt.execute();
			  stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Atualizado com sucesso..");
	}
}
