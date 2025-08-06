package logica;

import javax.swing.JOptionPane;

public class ProdutoMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arroz = JOptionPane.showInputDialog("Entre quantos arroz ? ");
		String feijao = JOptionPane.showInputDialog("Entre quantos feijao ?");
		
		double qArroz = Double.parseDouble(arroz);
		double qFeijao = Double.parseDouble(feijao);
		
		qArroz = 5.50; 
		qFeijao = 5;
		
		double soma = (qArroz * qArroz) + (qFeijao * qFeijao);
		
		JOptionPane.showMessageDialog(null, soma);
		

	}

}
