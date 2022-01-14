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

    private void ConfiguracaoIniacial (){
        tabuleiro.colocarPeça(new Torre(tabuleiro, cor.WHITE), new posicao(2, 1));
        tabuleiro.colocarPeça(new Rei(tabuleiro, cor.BLACK), new posicao(0, 4));
        tabuleiro.colocarPeça(new Rei(tabuleiro, cor.WHITE), new posicao(7, 4));
    }
    
}