package Teste;

public class Cliente {

	private String CPF;
	private String Nome;

	Cliente(String cpf, String nome) {
		this.CPF = cpf;
		this.Nome = nome;

	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return Nome;
	}

	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", Nome=" + Nome + "]";
	}

}
