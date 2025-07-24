package logica;

public class Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int conta = 0;
		for(conta = 0; conta <=10; conta++) {
			if(conta == 7 || conta == 5 || conta == 3) {
				System.out.println("oba voce achou o numero .... "+conta);
				System.out.println("vou para...");
				continue;
			}
		System.out.println("O numero e : " +conta);
		
	}}

}
