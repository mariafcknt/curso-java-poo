package exercicio02;

public class Viagem {
    String destino;
    int passagem;
    int pessoas;

    void status() {
        System.out.println("Destino: " + this.destino);
        System.out.println("Passagens: " + this.passagem);
        System.out.println("Passagens: " + this.pessoas);
    }

    void irViajar() {
        //total = passagem * valorPassagem;
    if (this.passagem >= pessoas) {
       //this.viajar = true;
       System.out.println("Viagem aprovada!");
    } else {
        System.out.println("ERRO! Não pode viajar!");
        }
    }
   
   
   }