package biludlejningsopgave;

public class Benzinbil extends Bil {

    private int oktantal;
    private int kmPrL;
// constructor for benzinbil. Fød med samme variable som Bil, plus oktantal og kmprl
    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrl;
    }
// getters og setters for nye variable
    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrl() {
        return kmPrL;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrL = kmPrl;
    }

    public double beregnGrønEjerafgift(){
       return AfgiftsBeregner.beregnGrønEjerafgift(kmPrL, 0, true);
        
    }
 
    
    
    
    @Override
    public String toString() {
        return "\n\nBenzinbil\n" + "Oktantal: " + oktantal + "\nKmPrL: " + kmPrL + "\nGrønejerafgift: " + beregnGrønEjerafgift()+ "\nregnr: " + RegnrFactory.getRegnr();
    
// if statements til at finde ud af afgift vha kmprl
    

}
}

