
public class NorthCar extends Loja {

	public NorthCar(String nome) {
		super(nome);

		Carro car5 = new Carro(7);
		car5.setModelo("tucson");
		car5.setCategoria("suv");
		
		setCarro(car5);
	}

	@Override
	public void aluga(String limite) {
		if(super.getCliente().getTipo() == 'R'&& super.getQuant() <=7){
			super.setTaxa(630);
			super.setTaxaFds(580);
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente regular é: " +super.getTaxaFds()+" para finais de semana");
		}else if(super.getCliente().getTipo() == 'P'&& super.getQuant() <=7){
			super.setTaxa(600);
			super.setTaxaFds(590);
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxa()+" para dias de semana");
			System.out.println("O valor da diaria para cliente Premium é: " +super.getTaxaFds()+" para finais de semana");
			
		}else {
			System.out.println("Opcao Invalida !!!!");
		}
	}

}
