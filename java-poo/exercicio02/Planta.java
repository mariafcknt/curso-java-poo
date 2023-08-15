package exercicio02;

public class Planta {
    String nome;
    Float tamanho;
    String cor;
    boolean flor;
    boolean regada;

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tem flores? " + this.flor);
        System.out.println("Está regada? " + this.regada);
    }

    void regar() {
        this.regada = true;
    }

    void florescer() {
        if (this.flor == true) {
            System.out.println("A planta vai florescer!");
        } else {
            System.out.println("ERRO! Não pode florescer!");
        }
    }

    void crescer() {
        if (this.regada == true) {
            System.out.println("A planta vai crescer!");
        } else {
            System.out.println("ERRO! Não pode crescer!");
        }
    }
}
