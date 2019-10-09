package biludlejningsopgave;

public class BiludlejningsOpgave1 {

    public static void main(String[] args) {
        //oprettelse af 3 nye bilobjekter, hhv 1 benzin 1 el og en dieselbil
        Bil benzin = new Benzinbil("", "ferrari", "swag", 1997, 4, 15, 25);
        Bil electric = new Elbil("", "Tesla", "modelx", 2018, 4, 4000, 300, 1000.0);
        Bil diesel = new Dieselbil("", "volvo", "sej", 1997, 4, false, 7);
        //oprettelse af et nyt garageobjekt
        Garage alisgarage = new Garage("Alis garage");
        //tilføjelse af oprettede biler til nye garage, vha tilføjbilmetoden i Garage klassen.
        alisgarage.tilføjBil(benzin);
        alisgarage.tilføjBil(electric);
        alisgarage.tilføjBil(diesel);
        //print af garagens indhold
        System.out.println(alisgarage);
     
        
        System.out.println("\nsamlet afgift for alle biler i alis garage: " + alisgarage.beregnGrønEjerafgiftForBilpark()); 
        
    }

}
