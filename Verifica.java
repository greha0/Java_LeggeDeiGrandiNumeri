/**
 * Classe che verifica che un dado a sei faccia non sia truccato
 * @author Greta Brugnatti
 */
public class Verifica {
    private int [] lanci;
    private int nLanci;
    public Verifica (){
        nLanci = 0;
        lanci = new int[6];
    }
    public void addLancio(int n){
        lanci[n]++;
        nLanci++;
    }

    public void stampaTabella(){
        System.out.println("1  2  3  4  5  6");
        System.out.println(lanci[0] + "  " + lanci[1] + "  " + lanci[2] + "  " + lanci[3] + "  " + lanci[4] + "  " + lanci[5]);
    }


}
