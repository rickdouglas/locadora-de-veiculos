
public abstract class Loja {
	private String nome;
	private Carro carro;
	private Cliente cliente;
	private double taxa;
	private double taxaFds;
	private int quant;
	
	public Loja (String nome){
		this.nome = nome;
	}
	public abstract void aluga(String limite);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getTaxaFds() {
		return taxaFds;
	}
	public void setTaxaFds(double taxaFds) {
		this.taxaFds = taxaFds;
	}

}
