package aplicacao.xadrez;

import javax.swing.text.Position;

import aplicacao.tabuleirogame.peça;
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

    public peçaDeXandrez executartMovXandrez(posiçaoXadrez origemPosicao, posiçaoXadrez destinoPosicao ){
        posicao origem = origemPosicao.convesãoParaPosicao();
        posicao destino = destinoPosicao.convesãoParaPosicao();
        validarOrigemPosicao (origem);
        peça capturaPeça = fazerMov (origem, destino);
        return (peçaDeXandrez) capturaPeça;

    }
    public peça fazerMov (posicao origem, posicao destino){
        peça p = tabuleiro.removerPeça(origem);
        peça capturaPeça = tabuleiro.removerPeça(destino);
        tabuleiro.colocarPeça(p, destino);
        return capturaPeça;

    }
    private void validarOrigemPosicao (posicao posicao){
        if (!tabuleiro.existeEssaPeça(posicao)){
            throw new excessao_xadrez("Não há peça na posição de origem");
        }
        if (!tabuleiro.peça(posicao).existeAlgumMovPossivel()){
            throw new excessao_xadrez("Não existe movimentos possiveis para essa peça escolhida");
        }
    }
       
    private void colocarNovaPeça(char coluna, int fileira, peçaDeXandrez peça) {

        tabuleiro.colocarPeça(peça, new posiçaoXadrez(coluna, fileira).convesãoParaPosicao());

    }
    private void ConfiguracaoIniacial (){
        
        
        colocarNovaPeça('c', 1, new Torre(tabuleiro, cor.WHITE));
        colocarNovaPeça('c', 2, new Torre(tabuleiro, cor.WHITE));
        colocarNovaPeça('d', 2, new Torre(tabuleiro, cor.WHITE));
        colocarNovaPeça('e', 2, new Torre(tabuleiro, cor.WHITE));
        colocarNovaPeça('e', 1, new Torre(tabuleiro, cor.WHITE));
        colocarNovaPeça('d', 1, new Rei(tabuleiro, cor.WHITE));

        colocarNovaPeça('c', 7, new Torre(tabuleiro, cor.BLACK));
        colocarNovaPeça('c', 8, new Torre(tabuleiro, cor.BLACK));
        colocarNovaPeça('d', 7, new Torre(tabuleiro, cor.BLACK));
        colocarNovaPeça('e', 7, new Torre(tabuleiro, cor.BLACK));
        colocarNovaPeça('e', 8, new Torre(tabuleiro, cor.BLACK));
        colocarNovaPeça('d', 8, new Rei(tabuleiro, cor.BLACK));
	}

    }
    
