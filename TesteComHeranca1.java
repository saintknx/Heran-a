public class TesteComHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.setNome("José");
        aluno.setIdade(19);
        aluno.setRa(2312345);
        System.out.printf("\nNome: %s \nIdade: %d\nRA: %d\n", aluno.getNome(), aluno.getIdade(), aluno.getRa());
    }
}
