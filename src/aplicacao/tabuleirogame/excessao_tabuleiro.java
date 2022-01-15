package aplicacao.tabuleirogame;

public class excessao_tabuleiro extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public excessao_tabuleiro (String msg){
        super(msg);
    }


    
}