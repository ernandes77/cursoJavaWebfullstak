package logica;

import javax.swing.JOptionPane;

public class JoptMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nota1 = JOptionPane.showInputDialog("Entre com a nota 1 : ");
		String nota2 = JOptionPane.showInputDialog("Entre com a nota 2 : ");
		String nota3 = JOptionPane.showInputDialog("Entre com a nota 3 : ");
		String nota4 = JOptionPane.showInputDialog("Enrte com a nota 4 : ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media =(dNota1+dNota2+dNota3+dNota4)/4;
		
		//Media de aprovacao
		if(media >=50) {
			if(media >=70) {
				JOptionPane.showMessageDialog(null,"Aluno esta aprovado "+ media);
			} else{
				JOptionPane.showMessageDialog(null,"Aluno esta de recuperacao "+ media);
			} 
			}else {
		JOptionPane.showMessageDialog(null, "Voce esta reprovado "+media);
			}}
		
	

	}


