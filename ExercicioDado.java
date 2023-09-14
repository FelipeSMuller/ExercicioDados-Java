package senaiprojetos;

import javax.swing.JOptionPane;

public class ExercicioDado {

	public static void main(String[] args) {

		/*
		 * Crie uma classe que simule a jogada de um dado de seis lados ( números 1 a 6)
		 * por três vezes. Ao final some seus valores e apresente o resultado das três
		 * jogadas.
		 */

		int soma = 0;
		int numeros[] = { (int) (Math.random() * 6 + 1), (int) (Math.random() * 6 + 1), (int) (Math.random() * 6 + 1) };

		JOptionPane.showMessageDialog(null, "Seja bem vindo ao jogo !!");
		JOptionPane.showMessageDialog(null, " Você tem três jogadas para fazer");
		JOptionPane.showMessageDialog(null, " Números fornecidos pelo dado : ");

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			JOptionPane.showMessageDialog(null, numeros[i]);
		}

		JOptionPane.showMessageDialog(null, " A soma de todos os valores do dado é igual a : " + soma);

	}

}
