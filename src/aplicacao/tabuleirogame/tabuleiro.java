package aplicacao.tabuleirogame;

public class tabuleiro {
    private int fileiras;
    private int colunas;
    private peça [][] peças;
    
    public tabuleiro(int fileiras, int colunas) {
        this.fileiras = fileiras;
        this.colunas = colunas;

        peças = new peça [fileiras] [colunas];
    }

    public int getFileiras() {
        return fileiras;
    }

    public void setFileiras(int fileiras) {
        this.fileiras = fileiras;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    @Override
    public String toString() {
        return fileiras + ", " + colunas;
    }

    
}