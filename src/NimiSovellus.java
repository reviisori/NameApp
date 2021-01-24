
import java.util.Scanner;

public class NimiSovellus {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        Henkilostorekisteri rekisteri = valiaikainen();
        
        Kayttoliittyma tani = new Kayttoliittyma(lukija, rekisteri);
        tani.kaynnista();
    }
    
    public static Henkilostorekisteri valiaikainen() {
        
        Henkilostorekisteri valiaikainen = new Henkilostorekisteri();
        
        return valiaikainen;
    }
    
}
