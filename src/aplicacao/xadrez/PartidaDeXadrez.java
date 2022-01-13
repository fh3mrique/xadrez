package aplicacao.xadrez;

import aplicacao.tabuleirogame.tabuleiro;

public class PartidaDeXadrez {

    tabuleiro tabuleiro;

    public PartidaDeXadrez () {
        tabuleiro = new tabuleiro(8, 8);
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
    
}