
public class SouthCar extends Loja {

	public SouthCar(String nome ) {
		super(nome);
		// TODO Auto-generated constructor stub
		Carro car1 = new Carro(4);
		car1.setModelo("celta");
		car1.setCategoria("compacto");
	
		setCarro(car1);
	}

	@Override
	public void aluga(String limite) {
		if(super.getCliente().getTipo() == 'R'&& super.getQuant() <=4){
			super.setTaxa(210);
			super.setTaxaFds(200);
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxaFds()+" para finais de semana");
		}else if(super.getCliente().getTipo() == 'P'&& super.getQuant() <=4){
			super.setTaxa(150);
			super.setTaxaFds(90);
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxaFds()+" para finais de semana");
			
		}else {
			System.out.println("Opcao Invalida !!!!");
		}
			
	}

}
