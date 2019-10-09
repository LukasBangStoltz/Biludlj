package biludlejningsopgave;

public class Elbil extends Bil {

    private int batterikapacitetKWh;
    private int maxKm;
    private double whPrKm;
// constructor for elbiler. Skal være født med alle variable som er givet i bil + batterikap, maxKM og whprKM
    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }
// Getters og setters for variable
    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    
        public double beregnGrønEjerafgift(){
            double kmPrL = 100.0/(whPrKm/91.25);
        return AfgiftsBeregner.beregnGrønEjerafgift(kmPrL, 0, true );
        
    }
    @Override
    public String toString() {
        return "\n\nElbil\n" + "Batterikapicitet: " + batterikapacitetKWh + "\nmaxKm: " + maxKm + "\nwhPrKm: " + whPrKm + "\nGrøn afgift: " + beregnGrønEjerafgift()+ "\nregnr: " + RegnrFactory.getRegnr();
    }
// Afgift udregnet ved hælp af if else og omregning fra whprkm til kmprl
    
    

}
