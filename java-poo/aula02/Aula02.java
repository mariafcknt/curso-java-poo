package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul"; //chamada a atributo
        c1.ponta = 0.5f; 
        //c1.tampada = false; 
        c1.tampar(); //chamada de método
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}