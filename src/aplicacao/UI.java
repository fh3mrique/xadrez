package aplicacao;

import aplicacao.tabuleirogame.peça;
import aplicacao.xadrez.peçaDeXandrez;

public class UI {
    public static void imprimirTabuleiro (peçaDeXandrez[][] peças) {
        for (int i = 0; i<peças.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j<peças.length; j++){
                imprimirPeça (peças[i][j]);
            }
             System.out.println();
        }
        
        System.out.println(" a b c d e f g h");


    }
    private static void imprimirPeça (peçaDeXandrez peça){
        if (peça == null){
            System.out.print("-");
        }
        else {
            System.out.print(peça);
        }
        System.out.print(" ");
    }
}