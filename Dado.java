import java.util.Random;

public class Dado {
    private int nFacce;

    /**
     * Costruttore di un dado dato il numero di facce
     * @param n Numero di facce
     */
    public Dado (int n){
        nFacce = n;
    }


    /**
     * Costruttore di un dado a 6 facce
     */
    public Dado (){
        nFacce = 6;
    }

    public int lancia(){
        Random random = new Random();
        return random.nextInt(nFacce)+1;
    }

    public static void main(String [] args){
        Dado dado = new Dado();
        Verifica tabella = new Verifica();
        for(int i=0; i<1000000; i++){
            tabella.addLancio(dado.lancia() - 1);
        }
        tabella.stampaTabella();
    }
}
