package att04;

public class att04Aluno {
    private String nome;
    private double[] notas;


    public att04Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }


    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }


    public void exibirDetalhes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média das Notas: " + calcularMedia());
    }
}
