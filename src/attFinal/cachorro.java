package attFinal;

public class cachorro {

    String raca;
    String nome;
    int idade;


    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public void comer() {
        System.out.println(nome + " está comendo!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
