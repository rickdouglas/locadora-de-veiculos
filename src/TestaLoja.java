import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// NESSA CLASSE SERA EXECUTADO O PASSO A PASSO DO ALGORITIMO( SERRA FEITA A LEITURA DO ARQUIVO TEXTO E FEITAS AS COMPARAÇES)

public class TestaLoja {
	
	double total = 0;
	int diarias =0;
	double preco;
	
	public static void main(String[] args) throws IOException {
		Loja south = new SouthCar("SouthCar");
		Loja west = new WestCar("WestCar");
		Loja north = new NorthCar("NorthCar");
		int opcao =0;
		String categoria;
	//String nome = "/home/rick/workspace/locadora-de-veiculos/locadora.txt";
		Scanner s = new Scanner(System.in);
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/home/rickdouglas/Downloads/Processo-Seletivo-Desenvolvedor-Java-Junior-master/locadora-de-veiculos/locadora.txt"));
			String line = reader.readLine();
			while (line != null) {
				
				String[] entradaArray = line.split(":");
				if(entradaArray == null || entradaArray[0].equals("")) {
					break;
				}
				categoria = entradaArray[0];
				int quantidade = Integer.valueOf(entradaArray[1]);
				String datas = entradaArray[2];
				String modeloCarro = "";
				String nomeCarro = "";
				if (categoria.equalsIgnoreCase(south.getCarro().getCategoria()) && quantidade == 4){
					modeloCarro = south.getCarro().getModelo();
					nomeCarro = south.getNome();
				} else if (categoria.equalsIgnoreCase(west.getCarro().getCategoria()) && quantidade == 2){ 
					modeloCarro = west.getCarro().getModelo();
					nomeCarro = west.getNome();
				} else if (categoria.equalsIgnoreCase(north.getCarro().getCategoria()) && quantidade == 7) {
					modeloCarro = north.getCarro().getModelo();
					nomeCarro = north.getNome();
				} else {
					System.out.println("Carro não existe");
				}

				System.out.println(modeloCarro + ":" + nomeCarro);
				
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		/*do{
			FileInputStream stream = new FileInputStream("/home/rick/workspace/locadora-de-veiculos/locadora.txt");
        	InputStreamReader reader = new InputStreamReader(stream);
        	BufferedReader br = new BufferedReader(reader);
        	String linha = br.readLine();
			categoria = br.toString();
			int quant = br.read();
			if (categoria == south.getCarro().getCategoria() && quant <=4){
				System.out.println(south.getCarro().getModelo()+":"+south.getNome());
				
			}else System.out.println("teste ruim");
			
			
		}while(opcao != 0);
		*/

	}

}
