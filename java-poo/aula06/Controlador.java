package aula06;

public interface Controlador {
  public abstract void ligar(); 
  public abstract void desligar();
  public abstract void abrirMenu();
  public abstract void fecharMenu();
  public abstract void maisVolume();
  public abstract void menosVolume();
  public abstract void ligarMudo();
  public abstract void desligarMudo();
  public abstract void play();
  public abstract void pause();
}

//no lugar do void pode ter o tipo de dado que vai retornar