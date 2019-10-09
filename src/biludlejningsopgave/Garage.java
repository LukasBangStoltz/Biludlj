

package biludlejningsopgave;

import java.util.ArrayList;


public class Garage {
private String navn;
ArrayList<Bil> garage = new ArrayList();
//constructor for garage
    public Garage(String navn) {
        this.navn = navn;
    }
    //metode til at tilføje/fjerne biler fra garagen
    public void tilføjBil (Bil bil){
        garage.add(bil);
    }
    public void fjernBil (Bil bil){
        garage.remove(bil);
    }
    //metode til at sammenregne afgift på alle biler i en given garage
 public double beregnGrønEjerafgiftForBilpark(){
       double result = 0;
       for (Bil x:garage){
       result += x.beregnGrønEjerafgift();
       }
       return result;
        
   }
    @Override
    public String toString() {
        return "Garage: "+ navn + garage;
    }
    
}
