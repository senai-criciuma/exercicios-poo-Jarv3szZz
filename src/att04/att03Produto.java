package att04;

public class att03Produto {
    private String nome;
    private double preco;


    public att03Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto de " + percentual + "% aplicado. Novo preço: R$ " + preco);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }


    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
