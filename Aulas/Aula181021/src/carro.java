
public class carro {
	public static void main(String[] args) {
		String joao = "João";
		String ana = "Ana";
		String jenifer = "Jenifer";
		String jonathan = "Jonathan";
		
		
		String[] carro = new String[4];
		carro[0] = joao;
		carro[1] = ana;
		carro[2] = jenifer;
		carro[3] = jonathan;
		
		System.out.println("Carro comporta: " + carro.length);
		
		for(int i = 0; i < carro.length; i++) {
			System.out.println(carro[i]);
		}
		
	}

}
