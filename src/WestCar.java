
public class WestCar extends Loja {

	public WestCar(String nome) {
		super(nome);

		Carro car3 = new Carro(2);
		car3.setModelo("lamborghini");
		car3.setCategoria("esportivo");
		setCarro(car3);
	}

	@Override
	public void aluga(String limite) {
		if(super.getCliente().getTipo() == 'R'&& super.getQuant() <=2){
			super.setTaxa(530);
			super.setTaxaFds(150);
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxaFds()+" para finais de semana");
		}else if(super.getCliente().getTipo() == 'P'&& super.getQuant() <=2){
			super.setTaxa(200);
			super.setTaxaFds(90);
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxaFds()+" para finais de semana");
			
		}else {
			System.out.println("Opcao Invalida !!!!");
		}
	}

	

}
