//Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
package primeiraUnidade.listaExerc.classPartUm.TimeDeFutebol;

public class TimeFutebol {
    String nome;
    String estadio;
    String tecnico;
    int overall;
    int pontos;
    int vitorias;
    int empates;
    int derrotas;
    int golsMarcados;
    int golsSofridos;
    int saldoGols;
    int jogos;
    
    void inicializaTime(String nome, String estadio, String tecnico, int overall){
        this.nome = nome;
        this.estadio = estadio;
        this.tecnico = tecnico;
        this.overall = overall;
    }

    void mostraTime(){
        System.out.printf("Nome: %s\nEstadio: %s\nTecnico: %s\nOverall: %d\n", nome, estadio, tecnico, overall);
    }

    void mostrarSituacaoCampeonato(){
        System.out.printf("Jogos: %d\nPontos: %d\nVitorias: %d\nDerrotas: %d\nEmpates: %d\nGols Marcados: %d\t Gols Sofridos %d\t Saldo De Gols %d", jogos, pontos, vitorias, derrotas, empates, golsMarcados, golsSofridos, saldoGols);

    }

    void registrarPartida(int golsMarcados, int golsSofridos){
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
        jogos++;

        if(golsMarcados > golsSofridos){
            vitorias++;
            pontos += 3;
            saldoGols += golsMarcados - golsSofridos;
        }else if(golsMarcados < golsSofridos){
            derrotas++;
            saldoGols += golsMarcados - golsSofridos;
        }else{
            empates++;
            pontos += 1;
        }
    }
}
