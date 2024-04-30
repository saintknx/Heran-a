public class Aluno extends Pessoa {
    private int ra;

    public Aluno (){
        super();
        System.out.println("Construindo um aluno.");
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
