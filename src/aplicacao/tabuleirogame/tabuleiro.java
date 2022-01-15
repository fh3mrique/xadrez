package aplicacao.tabuleirogame;

public class tabuleiro {
    private int fileiras;
    private int colunas;
    private peça [][] peças;
    
    public tabuleiro(int fileiras, int colunas) {
        if (fileiras < 1 || colunas <1 ){
            throw new excessao_tabuleiro("Erro na criação do tabuleiro: As fileiras e colunas necessitam de pelo menos uma 1 casa");
        }
        this.fileiras = fileiras;
        this.colunas = colunas;

        peças = new peça [fileiras] [colunas];
    }

    public int getFileiras() {
        return fileiras;
    }


    public int getColunas() {
        return colunas;
    }


    public peça peça (int fileiras, int colunas){
        if (!ExistenciaDePosição(fileiras, colunas)){
            throw new excessao_tabuleiro("Posição não existe no tabuleiro");
        }
        return peças[fileiras][colunas];
    }
    public peça peça (posicao posicao){
        if (!ExistenciaDePosição(posicao)){
            throw new excessao_tabuleiro("Posição não existe no tabuleiro");
        }
        return peças [posicao.getFileira()][posicao.getColuna()];
    }
    public void colocarPeça (peça peça, posicao posicao){
        if (existeEssaPeça(posicao)){
            throw new excessao_tabuleiro("já existe uma peça na posição: "+ posicao);
        }
        peças[posicao.getFileira()][posicao.getColuna()] = peça;
        peça.posicao= posicao;
    }
    
    public peça removerPeça (posicao posicao){
        if (!ExistenciaDePosição(posicao)){
            throw new excessao_tabuleiro("Posição não existe no tabuleiro");
        }
        if (peça(posicao)== null){
            
            return null;
        }
        peça aux = peça(posicao);
        aux.posicao = null;
        peças [posicao.getFileira()][posicao.getColuna()] = null;
        return aux;


    }
    private boolean ExistenciaDePosição(int fileira, int coluna) {
        return fileira >= 0 && fileira < fileiras && coluna >=0 && coluna < colunas;
    }
    public boolean ExistenciaDePosição (posicao posicao){
        return ExistenciaDePosição(posicao.getFileira(), posicao.getColuna());
    }
    
    public boolean existeEssaPeça(posicao posicao){
        if (!ExistenciaDePosição(posicao)){
            throw new excessao_tabuleiro("Posição não existe no tabuleiro");
        }
        return peça(posicao) != null;
    }

    
}