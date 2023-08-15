package aula06;

import java.util.Scanner;

public class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  private int getVolume() {
    return volume;
  }
  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean getLigado(){
    return ligado;
  }
  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private boolean getTocando() {
    return tocando;
  }
  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public void ligar() {
    this.setLigado(true);
  }
  
  @Override
  public void desligar() {
    this.setLigado(false);
  }
  
  @Override
  public void abrirMenu() {
    Scanner s = new Scanner(System.in);
    //implementar if para saber se está ligado
    if (!getLigado()) {
      System.out.println("Impossível abrir menu com o aparelho desligado. Deseja ligar? [S/N]");
      String resligar = s.nextLine();
      if (resligar.equals("S") || resligar.equals("s")){
        ligar();
      }
    }
    //System.out.println("------------------");

    while(true && getLigado()) {
      System.out.println();
      System.out.println("------ MENU ------");
      System.out.println("Está ligado? " + getLigado());
      System.out.println("Está tocando? " + getTocando());
      System.out.print("Volume: " + getVolume() + " ");
      for (int i = 0; i <= this.getVolume(); i += 10) {
        System.out.print("|");
      }
      System.out.println();
      System.out.println();

      System.out.println("1 - Ligar");
      System.out.println("2 - Desligar");
      System.out.println("3 - Play");
      System.out.println("4 - Pause");
      System.out.println("5 - Aumentar volume");
      System.out.println("6 - Diminuir volume");
      System.out.println("7 - Ativar mudo");
      System.out.println("8 - Desativar mudo");
      System.out.println("9 - Sair");
      System.out.print("Escolha uma das opções: ");
      int resposta = s.nextInt();

      if (resposta == 1) {
        ligar();
        System.out.println("Ligado: " + getLigado());
      } else if (resposta == 2) {
        desligar();
        fecharMenu();
        System.out.println("Aparelho desligado");
      } else if (resposta == 3) {
        play();
      } else if (resposta == 4) {
        pause();
      } else if (resposta == 5) {
        maisVolume();
      } else if (resposta == 6) {
        menosVolume();
      } else if (resposta == 7) {
        ligarMudo();
      } else if (resposta == 8) {
        desligarMudo();
      }

      if (resposta == 9) {
        fecharMenu();
        break;
      }
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu...");
  }

  @Override
  public void maisVolume() {
    if (this.getLigado()) {
      this.setVolume(this.getVolume() + 5);
      System.out.print("Volume aumentado com sucesso!");
    }  else {
      System.out.println("Impossível aumentar volume");
    }
    System.out.println();
  }

  @Override
  public void menosVolume() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(this.getVolume() - 5);
      System.out.print("Volume diminuído com sucesso!");
    } else {
      System.out.println("Impossível diminuir volume");
    }
    System.out.println();
  }

  @Override
  public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
      System.out.println("Mudo ativado!");
    } 
  }

  @Override
  public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0) {
      this.setVolume(50);
      System.out.println("Mudo desativado!");
    }
  }

  @Override
  public void play() {
    if (this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
      System.out.println("Reprodução ativada");
    } else {
      System.out.println("Impossível reproduzir!");
    }
  }

  @Override
  public void pause() {
    if (this.getLigado() && this.getTocando()){
      this.setTocando(false);
      System.out.println("Reprodução pausada");
    } else {
      System.out.println("Impossível pausar!");
    }
  }
}