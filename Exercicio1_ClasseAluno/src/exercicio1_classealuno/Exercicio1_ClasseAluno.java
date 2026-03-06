package exercicio1_classealuno;

public class Exercicio1_ClasseAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Henrique Ibarra Ortiz Urbano", 7.0, 8.0);

        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Média do aluno: " + aluno1.calcularMedia());
        System.out.println("O aluno esta: " + aluno1.verificarAprovacao());
    }
    
}
