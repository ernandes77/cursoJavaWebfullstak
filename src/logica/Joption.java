package logica;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {

		String pessoas = JOptionPane.showInputDialog("informe quantidade de pessoas ");
		String sorvetes = JOptionPane.showInputDialog("Informe quantidade de Sorvetes");
		
		double numeroPessoas = Double.parseDouble(pessoas);
		double numeroSorvetes = Double.parseDouble(sorvetes);
		
		int divisao = (int)(numeroPessoas / numeroSorvetes);
		int resto = (int)(numeroPessoas % numeroSorvetes);
		
		//System.out.println("Divisao de pessoas " + divisao + " Resto de Sorvetes " +resto);
		
		int resultado = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao ");
		if(resultado == 0) {
			JOptionPane.showMessageDialog(null, "divisao de pessoas deu "+divisao);
		}else {
			System.out.println("Nao quiz ver o resultado");
		}
		resultado =JOptionPane.showConfirmDialog(null, "deseja ver resultado do resto ");
				if(resultado ==0) {
					JOptionPane.showMessageDialog(null, "o valor do resto e "+resto);
				}else {
					System.out.println("Nao quiz ver o resultado "+resto);
				}
		
		
		JOptionPane.showMessageDialog(null, "Divisao de pessoas " + divisao + " Resto de Sorvetes " +resto);
	}
}
