package xadrezpecas;

import aplicacao.xadrez.cor;
import aplicacao.xadrez.peçaDeXandrez;

public class Torre extends peçaDeXandrez{

    public Torre(aplicacao.tabuleirogame.tabuleiro tabuleiro, cor cor) {
        super(tabuleiro, cor);
        
    }

    @Override
    public String toString() {
        
        return "T";
    }
    
    
}