package aplicacao.xadrez;

import aplicacao.tabuleirogame.posicao;

public class posiçaoXadrez {
    private char coluna;
    private int fileira;
    
    public posiçaoXadrez(char coluna, int fileira) {
        if (coluna < 'a' || coluna > 'h' && fileira < 1 || fileira >8){
            throw new excessao_xadrez("Erro na instanciação da posição do xadrez");
        }
        this.coluna = coluna;
        this.fileira = fileira;
    }

    public char getColuna() {
        return coluna;
    }

    
    public int getFileira() {
        return fileira;
    }

    protected posicao convesãoParaPosicao (){
        return new posicao(8 - fileira, coluna - 'a');
    }
    protected static posiçaoXadrez convesãoDaPosicao (posicao posicao) {
        return new posiçaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getFileira());

    }

    @Override
    public String toString() {
        return "" + coluna + fileira;
    }
    
    
    
}