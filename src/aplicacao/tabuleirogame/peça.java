package aplicacao.tabuleirogame;

public class peça {
    protected posicao posicao;
    private tabuleiro tabuleiro;
    
    public peça(aplicacao.tabuleirogame.tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected tabuleiro getTabuleiro() {
        return tabuleiro;
    }

  

    
    


   
}