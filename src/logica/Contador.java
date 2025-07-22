package logica;

public class Contador {
	
	public static void main (String []args) {
	int numero = 10;
	
	while(numero >=0) {
		System.out.println("O numero e : " +numero);
		numero--;
	}
	System.out.println("--------------------------------------");
	int numero2 = 0;
	do {
		System.out.println("numero2 : "+numero2);
		numero2++;
	}while(numero2 <=20);
}
}