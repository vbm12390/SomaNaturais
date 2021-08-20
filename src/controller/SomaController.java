package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		//Condição de parada
		if (numero <= 0) {
			return 0;
		}else {
			numero = numero + soma(numero - 1);
			return numero;
		}
	}

}
