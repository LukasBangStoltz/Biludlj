

package biludlejningsopgave;

import java.util.Random;


public class RegnrFactory {
    private static Random random = new Random();
    
    public static String getRegnr(){
        String result = "";
        for (int i = 0; i<2;i++) result += (char) (random.nextInt(26)+65);
        for (int i= 0; i<5;i++) result += random.nextInt(10);
        return result;
    }
}
