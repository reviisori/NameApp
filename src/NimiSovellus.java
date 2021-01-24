
import java.util.Scanner;

public class NimiSovellus {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        Henkilostorekisteri rekisteri = valiaikainen();
        
        Kayttoliittyma tani = new Kayttoliittyma(lukija, rekisteri);
        tani.kaynnista();
    }
    // tämä metodi toimii väliaikaisena keinona toteuttaa ohjelma,
    // tarkoituksenaan lopulta toimia .json tiedostojen lukija
    public static Henkilostorekisteri valiaikainen() {
        
        Henkilostorekisteri valiaikainen = new Henkilostorekisteri();
        
        // toimivuuttaa voi kokeilla luomalla henkilöitä ja lisäämällä niitä
        // palautettavaan Henkilöstörekisteriin
        // esimerkiksi:
        
        Henkilo ville = new Henkilo("Ville", 24); 
        Henkilo anna = new Henkilo("Anna", 6);
        Henkilo antti = new Henkilo("Antti", 22);
        Henkilo sanna = new Henkilo("Sanna", 5);
        // jne.
        valiaikainen.lisaa(ville);
        valiaikainen.lisaa(anna);
        valiaikainen.lisaa(antti);
        valiaikainen.lisaa(sanna);
        // jne.
        
        return valiaikainen;
    }
    
}
