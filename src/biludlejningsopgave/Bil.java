package biludlejningsopgave;

public abstract class Bil {

    private String regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;
    
//min constuctor for alle biler, skal være født med renr, mærke, model, årgang og antal døre
    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = RegnrFactory.getRegnr();
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
        
    }
// getters og setters for alle variable 
   

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    

        
   public abstract double  beregnGrønEjerafgift();
       
   
    }
