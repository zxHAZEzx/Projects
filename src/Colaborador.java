public class Colaborador  extends Pessoa{
    private String cargo;
    public Colaborador (String nome, String cpf, int idade, String cargo){
        super(nome, cpf, idade);
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo;
    }
}