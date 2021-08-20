package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		//Condição de parada se o número for menor ou igual a zero retona 0.
		if (numero <= 0) {
			return 0;
		}else {
			numero = numero + soma(numero - 1);
			return numero;
		}
	}

}
