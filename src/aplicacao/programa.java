package aplicacao;

import aplicacao.tabuleirogame.posicao;
import aplicacao.tabuleirogame.tabuleiro;

public class programa {
    
    public static void main(String[] args) {
        
    posicao p = new posicao(2, 4);

    tabuleiro t = new tabuleiro (2, 4); 
    System.out.println(t);


    }
}