public class TesteNovosConstrutores {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 37);
        Aluno a = new Aluno("Maria", 19, 19001101);

        System.out.printf("\nAluno Nome: %s, Idade: %d, RA: %d\n", a.getNome(), a.getIdade(), a.getRa());
        System.out.println(a);
    }
}
