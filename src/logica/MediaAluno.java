package logica;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int media = 20;

		if (media == 70) {
			System.out.println("Aluno aprovado = " + media);

		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno recuperacao = " + media);
		} else
			System.out.println("Aluno nao encontrado ");
	}

}
