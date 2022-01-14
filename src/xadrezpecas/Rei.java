package xadrezpecas;

import aplicacao.xadrez.cor;
import aplicacao.xadrez.peçaDeXandrez;

public class Rei extends peçaDeXandrez{

    public Rei(aplicacao.tabuleirogame.tabuleiro tabuleiro, cor cor) {
        super(tabuleiro, cor);
        
    }
    @Override
    public String toString() {
        return "R";
    }
    
}