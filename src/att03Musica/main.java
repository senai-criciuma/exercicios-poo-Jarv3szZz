package att03Musica;

public class main {
    public static void main(String[] args) {
        // Criando uma instância da classe Musica
        Musica musica = new Musica("Imagine", "John Lennon", 1971);

        // Exibindo a ficha técnica antes das avaliações
        musica.exibirFichaTecnica();

        // Avaliando a música
        musica.avaliar(9.5);
        musica.avaliar(8.0);
        musica.avaliar(10.0);

        // Exibindo a ficha técnica após as avaliações
        musica.exibirFichaTecnica();
    }
}
}
