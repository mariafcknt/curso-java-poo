package exercicio02;

public class Exercicio02 {

    public static void main (String[] args) {
        /* 
        Planta p1 = new Planta();
        p1.nome = "Cacto";
        p1.tamanho = 3.5f;
        p1.cor = "Verde";
        p1.flor = false;
        p1.status();
        p1.regar();
        p1.florescer();
        p1.crescer();
        System.out.println();
        Planta p2 = new Planta();
        p2.nome = "Rosa";
        p2.tamanho = 30.5f;
        p2.cor = "Vermelho";
        p2.flor = true;
        p2.status();
        p2.florescer();
        p2.crescer();
        */

        Viagem v1 = new Viagem();
        v1.destino = "Cancún";
        v1.passagem = 3;
        v1.pessoas = 3;
        v1.status();
        v1.irViajar();
        System.out.println();
        Viagem v2 = new Viagem();
        v2.destino = "Áustria";
        v2.pessoas = 5;
        v2.passagem = 2;
        v2.status();
        v2.irViajar();
    }
    

}