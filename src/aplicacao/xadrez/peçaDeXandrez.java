package aplicacao.xadrez;

import aplicacao.tabuleirogame.peça;

public class peçaDeXandrez extends peça {

    cor Cor;

    public peçaDeXandrez(aplicacao.tabuleirogame.tabuleiro tabuleiro, cor cor) {
        super(tabuleiro);
        Cor = cor;
    }

    public cor getCor() {
        return Cor;
    }

   
    

    
}