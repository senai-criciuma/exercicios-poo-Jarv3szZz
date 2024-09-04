package att03Musica;

public class Musica {
    private String titulo;
    private String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    public void lerDadosMusica(){




    public Musica(String titulo, String artista, int anoLancamento) {
            this.titulo = titulo;
            this.artista = artista;
            this.anoLancamento = anoLancamento;
            this.avaliacao = 0.0;
            this.numAvaliacoes = 0;
        }


        public void exibirFichaTecnica() {
            System.out.println("Título: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de Lançamento: " + anoLancamento);
            System.out.println("Número de Avaliações: " + numAvaliacoes);
            System.out.println("Avaliação Média: " + calcularMediaAvaliacoes());
        }


        public void avaliar(double nota) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
            } else {
                this.avaliacao += nota;
                this.numAvaliacoes++;
                System.out.println("Obrigado pela avaliação!");
            }
        }


        public double calcularMediaAvaliacoes() {
            if (numAvaliacoes == 0) {
                return 0.0;
            } else {
                return avaliacao / numAvaliacoes;
            }
        }

    }

    private String calcularMediaAvaliacoes() {
    }

}
