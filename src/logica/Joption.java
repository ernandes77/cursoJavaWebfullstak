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
		
		JOptionPane.showMessageDialog(null, "Divisao de pessoas " + divisao + " Resto de Sorvetes " +resto);
	}
}
