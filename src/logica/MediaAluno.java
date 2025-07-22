package logica;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int media = 20;
		 * 
		 * if (media == 70) { System.out.println("Aluno aprovado = " + media);//calcula
		 * a media e mostrara aprovado
		 * 
		 * } else if (media >= 40 && media <= 69) {
		 * System.out.println("Aluno recuperacao = " + media);//calcula a media e
		 * mostrara recuperacao } else
		 * System.out.println("Aluno nao encontrado ");//caso nao cai em nenhum mostra
		 * aluno nao encontrad }
		 */

		// operadores ternarios

		int nota1 = 10;
		int nota2 = 100;
		int media = nota1 + nota2;

//mesma logica if else so que na mesman linha 
		String saidaDeDados = media >= 70 ? "APROVADO"
				: (media >= 40 && media <= 69) ? "aluno recuperacao " : "aluno reprovado";

		System.out.println(saidaDeDados);

	}
}
