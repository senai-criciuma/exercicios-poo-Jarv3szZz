package attFinal;

public class carro {

    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;


    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;

    }
    public void acelerar(double aumento) {
        if (aumento > 0) {
            velocidadeAtual += aumento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para acelerar.");
        }
    }
    public void frear(double reducao) {
        if (reducao > 0 && velocidadeAtual > 0) {
            velocidadeAtual -= reducao;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para frear.");
        }
    }

    // Método para dar ré
    public void darRe() {
        if (velocidadeAtual == 0) {
            System.out.println("O carro está dando ré.");
        } else {
            System.out.println("Pare o carro para dar ré.");
        }
    }
}