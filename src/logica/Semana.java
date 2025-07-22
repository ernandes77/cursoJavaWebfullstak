package logica;

public class Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 8;

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Terca - Feira");
			break;
		case 3:
			System.out.println("Quarta - feira");
			break;
		case 4:
			System.out.println("Quinta - feira");
			break;
		case 5:
			System.out.println("Sexta - feira");
			break;
		case 6: System.out.println("Sabado");
		break;
		case 7 : System.out.println("Segund -Feira");
		default:System.out.println("Opcao Nao Encontrado Numero Invalido");
			break;
		}
	}
}