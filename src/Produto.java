public class Produto {
    private int id;
    private String nome;
    private String validade;
    private int prioridade;
    private String descricao;
    private double preco;
    public Produto(int id, String nome, String validade, String descricao, int prioridade, double preco){
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.descricao = descricao;
        this.preco = preco;
        this.prioridade = prioridade;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    public String getValidade() {
        return validade;
    }
    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Validade: %s | Prioridade: %d | Descrição: %s | Preço: R$ %.2f",
                id, nome, validade, prioridade, descricao, preco);
    }
}