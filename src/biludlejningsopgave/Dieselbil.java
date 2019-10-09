package biludlejningsopgave;

public class Dieselbil extends Bil {

    private boolean harPartikelfilter;
    private int kmPrL;
// constructor til dieselbil. Født med samme variable som Bil, plus en boolean der fortæller om den har partikelfilter og kmprl
    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }
//getters og setters til nye variable
    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift(){
       return AfgiftsBeregner.beregnGrønEjerafgift(kmPrL, 1, harPartikelfilter );
        
    }
    @Override
    public String toString() {
        return "\n\nDieselbil\n" + "Partiekfilter?: " + harPartikelfilter + "\nkmPrL: " + kmPrL + "\nGrøn afgift: " + beregnGrønEjerafgift() + "\nregnr: " + RegnrFactory.getRegnr();
    }
// afgift beregnet via if, og pålagt ekstra afgift grundet diesel
    
  
    

}
