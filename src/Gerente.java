public class Gerente extends Pessoa {
    private String senha;
    public Gerente (String nome, String cpf, int idade, String senha){
        super ( nome, cpf, idade);
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
}