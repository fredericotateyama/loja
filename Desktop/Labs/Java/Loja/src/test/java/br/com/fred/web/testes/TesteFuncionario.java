package br.com.fred.web.testes;

import br.com.fred.web.entidade.Funcionario;
import br.com.fred.web.persistencia.FuncionarioDAO;

public class TesteFuncionario {

	public static void main(String[] args) {
		//testeCadastrar();
		testaAtualizar();

	}

	private static void testeCadastrar() {
		Funcionario func = new Funcionario();
		  func.setNome("Olavao Bilac");
		  func.setCpf("1234565789");
		  func.setCargo("Porteiro");
		   FuncionarioDAO dao = new FuncionarioDAO();
		    dao.cadastrarFuncionario(func); 		
	}
	
	public static void testaAtualizar(){
		Funcionario func = new Funcionario();
		  func.setId(2);
		  func.setCpf("01010101");
		  func.setNome("Paulo RIcardo");
		  func.setCargo("segurança");
		  
		  FuncionarioDAO dao = new FuncionarioDAO();
		    dao.atualizaFuncionario(func);
	}
	

}
