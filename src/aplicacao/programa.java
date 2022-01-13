package aplicacao;

import aplicacao.tabuleirogame.posicao;
import aplicacao.tabuleirogame.tabuleiro;
import aplicacao.xadrez.PartidaDeXadrez;

public class programa {
    
    public static void main(String[] args) {
        
    PartidaDeXadrez partida1 = new PartidaDeXadrez();
    UI.imprimirTabuleiro(partida1.getpeças());

    }
}