
public class Main {
	public static  void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.ano = 1981;
		carro1.setMarca("Ford");
		carro1.setModelo("Fiesta");
		carro1.setQuadroPortas(true);
		
		carro1.imprimirDados();
	}

}
