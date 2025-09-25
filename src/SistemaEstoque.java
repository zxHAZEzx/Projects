import java.util.*;

public class SistemaEstoque {
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Produto> solicitados = new ArrayList<>();
    private static List<Colaborador> colaboradores = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", "12345678900", 40, "admin123");
        System.out.println("=== Login do Gerente ===");
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Digite a Senha: ");
        String senha = sc.nextLine();
        if (cpf.equals(gerente.getCpf()) && senha.equals(gerente.getSenha())) {
            System.out.println("\nLogin realizado com sucesso! Bem-vindo, " + gerente.getNome() + "\n");
            menu(gerente);
        } else {
            System.out.println("Credenciais inválidas. Encerrando...");
        }
    }
    private static void menu(Gerente gerente) {
        int opcao;
        do {
            System.out.println("\n=== Menu Principal | Gerente: " + gerente.getNome() + " ===");
            System.out.println("1 - Cadastrar Colaborador");
            System.out.println("2 - Listar Colaboradores");
            System.out.println("3 - Adicionar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Solicitar Produto");
            System.out.println("6 - Relatório Final");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> cadastrarColaborador();
                case 2 -> listarColaboradores();
                case 3 -> adicionarProduto();
                case 4 -> removerProduto();
                case 5 -> solicitarProduto();
                case 6 -> relatorio();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    private static void cadastrarColaborador() {
        System.out.println("\n=== Cadastro de Colaborador ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        colaboradores.add(new Colaborador(nome, cpf, idade, cargo));
        System.out.println("✅ Colaborador cadastrado com sucesso!");
    }
    private static void listarColaboradores() {
        System.out.println("\n=== Lista de Colaboradores ===");
        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
        } else {
            colaboradores.forEach(System.out::println);
        }
    }
    private static void adicionarProduto() {
        System.out.println("\n=== Adicionar Produto ===");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Validade: ");
        String validade = sc.nextLine();
        System.out.print("Descrição: ");
        String descricao = sc.nextLine();
        System.out.print("Prioridade (1 a 5): ");
        int prioridade = sc.nextInt();
        sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();
        produtos.add(new Produto(id, nome, validade, descricao, prioridade, preco));
        System.out.println("✅ Produto adicionado com sucesso!");
    }
    private static void removerProduto() {
        System.out.print("\nDigite o ID do produto a remover: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("❌ Produto removido com sucesso.");
        } else {
            System.out.println("⚠ Produto com ID " + id + " não encontrado.");
        }
    }
    private static void solicitarProduto() {
        System.out.print("\nDigite o ID do produto a solicitar: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Produto p : produtos) {
            if (p.getId() == id) {
                solicitados.add(p);
                System.out.println("📌 Produto solicitado com sucesso!");
                return;
            }
        }
        System.out.println("⚠ Produto não encontrado.");
    }
    private static void relatorio() {
        System.out.println("\n=== Relatório Final ===");

        System.out.println("\n📦 Produtos em Estoque:");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto disponível.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p.toString());
            }
        }
        System.out.println("\n📌 Produtos Solicitados:");
        if (solicitados.isEmpty()) {
            System.out.println("Nenhum produto solicitado.");
        } else {
            for (Produto p : solicitados) {
                System.out.println(p.toString());
            }
        }
    }
}