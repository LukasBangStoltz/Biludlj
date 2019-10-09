

package biludlejningsopgave;


public class AfgiftsBeregner {
public static double beregnGrønEjerafgift(double kmPrL, int dieselFactor, boolean harPartikelfilter) {
        
    double værdi = 0.0;
    if (kmPrL >= 20 && kmPrL < 50) {
            værdi = 330 + (dieselFactor*130);
        }
        else if (kmPrL >= 15 && kmPrL < 20) {
            værdi = 1050 + (dieselFactor*1390);
        }
        else if (kmPrL >= 10 && kmPrL < 15) {
            værdi = 2340 + (dieselFactor*1850);
        }
        else if (kmPrL >= 5 && kmPrL < 10) {
            værdi = 5500 + (dieselFactor*2770);
        }
        else if (kmPrL < 5) {
            værdi = 10470 + (dieselFactor*15260);
        }
        if (!harPartikelfilter){
            værdi +=1000;
        }
        return værdi;
}
}




// diseselbil til senere

//  public double beregnGrønEjerafgift() {
//        double tax = super.beregnGrønEjerafgift(kmPrL);
//
//        if (kmPrL >= 20 && kmPrL < 50) {
//            tax = tax +  130;
//        }
//        if (kmPrL >= 15 && kmPrL < 20) {
//            tax = tax + 1390;
//        }
//        if (kmPrL >= 10 && kmPrL < 15) {
//            tax = tax + 1850;
//        }
//        if (kmPrL >= 5 && kmPrL < 10) {
//            tax = tax + 2770;
//        }
//        if (kmPrL < 5) {
//            tax = tax + 15260;
//        }
//        if (!harPartikelfilter) {
//            tax += 1000;
//        }
//        return tax;
//}
