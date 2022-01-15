package aplicacao;

import java.util.Scanner;

import aplicacao.tabuleirogame.posicao;
import aplicacao.tabuleirogame.tabuleiro;
import aplicacao.xadrez.PartidaDeXadrez;
import aplicacao.xadrez.peçaDeXandrez;
import aplicacao.xadrez.posiçaoXadrez;

public class programa {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        
    PartidaDeXadrez PartidaDeXadrez= new PartidaDeXadrez();
    while (true){
        UI.imprimirTabuleiro(PartidaDeXadrez.getpeças());
        System.out.println();
        System.out.print("Origem: ");
        posiçaoXadrez origem = UI.lerPosicaoXadrez(entrada);

        System.out.println();
        System.out.print("Destino: ");
        posiçaoXadrez destino = UI.lerPosicaoXadrez(entrada);

       peçaDeXandrez captuPeçaDeXandrez = PartidaDeXadrez.executartMovXandrez(origem, destino);

    }
    

    }
}