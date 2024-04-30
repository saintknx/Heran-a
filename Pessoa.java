public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa (){
        System.out.println("Construindo uma pessoa.");
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construindo uma pessoa.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
