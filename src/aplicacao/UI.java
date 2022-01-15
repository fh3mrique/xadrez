package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import aplicacao.tabuleirogame.peça;
import aplicacao.xadrez.cor;
import aplicacao.xadrez.peçaDeXandrez;
import aplicacao.xadrez.posiçaoXadrez;

public class UI {
    public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static posiçaoXadrez lerPosicaoXadrez(Scanner entrada){
        try{
            String s = entrada.nextLine();
            char coluna = s.charAt(0);
            int fileira = Integer.parseInt(s.substring(1));
            return new posiçaoXadrez(coluna, fileira);}
            catch(RuntimeException e) {
                throw new InputMismatchException("Erro na criação do tabuleiro: As fileiras e colunas necessitam de pelo menos uma 1 casa");

            }
        


    } 
    public static void imprimirTabuleiro (peçaDeXandrez[][] peças) {
        for (int i = 0; i<peças.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j<peças.length; j++){
                imprimirPeça (peças[i][j]);
            }
             System.out.println();
        }
        
        System.out.println("  a b c d e f g h");


    }
    private static void imprimirPeça (peçaDeXandrez peça){
        if (peça == null){
            System.out.print("-");
        }
        else {
            if (peça.getCor() == cor.WHITE) {
                System.out.print(ANSI_WHITE + peça + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + peça + ANSI_RESET);
            }
        }
         System.out.print(" ");
    }
}