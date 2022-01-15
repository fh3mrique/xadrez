package aplicacao.xadrez;

import aplicacao.tabuleirogame.posicao;
import aplicacao.tabuleirogame.tabuleiro;
import xadrezpecas.Rei;
import xadrezpecas.Torre;

public class PartidaDeXadrez {

    tabuleiro tabuleiro;

    public PartidaDeXadrez () {
        tabuleiro = new tabuleiro(8, 8);
        ConfiguracaoIniacial();
    }

    public peçaDeXandrez [][] getpeças () {
    
        peçaDeXandrez [][] mat = new peçaDeXandrez[tabuleiro.getFileiras()] [tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getFileiras(); i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++ ){
                mat [i][j] = (peçaDeXandrez) tabuleiro.peça(i, j);
            }
        }
        return mat;
    }
       
    private void colocarNovaPeça(char coluna, int fileira, peçaDeXandrez peça) {

        tabuleiro.colocarPeça(peça, new posiçaoXadrez(coluna, fileira).convesãoParaPosicao());

    }
    private void ConfiguracaoIniacial (){
        colocarNovaPeça('b', 6, new Torre(tabuleiro, cor.WHITE));
       colocarNovaPeça('e', 8, new Rei (tabuleiro, cor.BLACK));
        colocarNovaPeça('e', 1 , new Rei(tabuleiro, cor.WHITE));
    }
    
}