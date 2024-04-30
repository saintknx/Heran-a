public class Aluno extends Pessoa {
    private int ra;

    public Aluno (){
        super();
        System.out.println("Construindo um aluno.");
    }

    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
        System.out.println("Construindo aluno...");
    }
    

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
