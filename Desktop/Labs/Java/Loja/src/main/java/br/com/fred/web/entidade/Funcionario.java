package br.com.fred.web.entidade;

public class Funcionario {

	private Integer id;
	private String nome;
	private String cpf;
	private String cargo;
	
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getCpf() {
				return cpf;
			}
			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
			public String getCargo() {
				return cargo;
			}
			public void setCargo(String cargo) {
				this.cargo = cargo;
			}
			
			@Override
			public String toString() {
				return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + "]";
			}
			
			
	
}
