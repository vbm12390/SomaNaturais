package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController sc = new SomaController();
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
		int soma = sc.soma(numero);
		System.out.println(soma);
	}

}
