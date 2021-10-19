


public class Exercicio3 {

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		
		Aluno aluno = new Aluno("Alano", notas);
		System.out.println("Nome do Aluno: " + aluno.nome);
		System.out.println("Maior nota: " + aluno.maiorNota());
		System.out.println("Média do aluno: " + aluno.media());
		System.out.println("O Aluno foi: " + aluno.aprovado());
		
	}	
}
