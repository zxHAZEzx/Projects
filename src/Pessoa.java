import java.util.Locale;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade;
    }
}