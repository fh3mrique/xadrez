package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import aplicacao.tabuleirogame.posicao;
import aplicacao.tabuleirogame.tabuleiro;
import aplicacao.xadrez.PartidaDeXadrez;
import aplicacao.xadrez.excessao_xadrez;
import aplicacao.xadrez.peçaDeXandrez;
import aplicacao.xadrez.posiçaoXadrez;

public class programa {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        
    PartidaDeXadrez PartidaDeXadrez= new PartidaDeXadrez();
    while (true){
    try{
        UI.clearScreen();
        UI.imprimirTabuleiro(PartidaDeXadrez.getpeças());
        System.out.println();
        System.out.print("Origem: ");
        posiçaoXadrez origem = UI.lerPosicaoXadrez(entrada);

        System.out.println();
        System.out.print("Destino: ");
        posiçaoXadrez destino = UI.lerPosicaoXadrez(entrada);

       peçaDeXandrez captuPeçaDeXandrez = PartidaDeXadrez.executartMovXandrez(origem, destino);
} catch(excessao_xadrez e){
    System.out.println(e.getMessage());
    entrada.nextLine();

}
catch(InputMismatchException e){
    System.out.println(e.getMessage());
    entrada.nextLine();

}
     }
    

    }
}