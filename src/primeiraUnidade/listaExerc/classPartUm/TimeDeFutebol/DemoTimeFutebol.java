package primeiraUnidade.listaExerc.classPartUm.TimeDeFutebol;

public class DemoTimeFutebol {
  public static void main(String[] args){
    TimeFutebol saoPaulo = new TimeFutebol();
    saoPaulo.inicializaTime("sao paulo", "Morumbis", "Zubeldía", 7);
    saoPaulo.mostraTime();
    saoPaulo.registrarPartida(3, 1);
    saoPaulo.registrarPartida(3, 1);
    saoPaulo.registrarPartida(3, 3);
    saoPaulo.registrarPartida(5, 7);
    saoPaulo.mostrarSituacaoCampeonato();
  }  
}
