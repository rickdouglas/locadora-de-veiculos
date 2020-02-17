
public class Carro {
	private String modelo;
	private String categoria; // Se é compacto, esportivo ou SUV
	private int limite;
	
	
	
	public Carro(int limite) {
		this.limite = limite;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getLimite() {
		return limite;
	}
	

}
