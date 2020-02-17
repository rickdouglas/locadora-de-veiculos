
public class TesteCarro {

	public static void main(String[] args) {
		
		Carro car1 = new Carro(4);
		car1.setModelo("celta");
		car1.setCategoria("compacto");
	
		Carro car2 = new Carro(4);
		car2.setModelo("gol");
		car2.setCategoria("compacto");
		
		Carro car3 = new Carro(2);
		car3.setModelo("lamborghini");
		car3.setCategoria("esportivo");
		
		Carro car4 = new Carro(2);
		car4.setModelo("ferrari");
		car4.setCategoria("esportivo");
		
		Carro car5 = new Carro(7);
		car5.setModelo("tucson");
		car5.setCategoria("suv");
		
		Carro car6 = new Carro(7);
		car6.setModelo("duster");
		car6.setCategoria("suv");
		
		System.out.println("o carro modelo 1 é: "+car1.getModelo());
		System.out.println("que pertence a categoria : "+car1.getCategoria());

	}

}
