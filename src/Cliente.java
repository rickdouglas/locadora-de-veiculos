
public class Cliente {
	private String nome;
	private String cpf;
	private char tipo; // R para regular ou P para premium
	
	
	
	public Cliente(String nome, String cpf, char tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
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
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}
