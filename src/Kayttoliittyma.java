
import java.util.Scanner;

public class Kayttoliittyma {
    
    private Scanner lukija;
    private Henkilostorekisteri rekisteri;
    
    public Kayttoliittyma(Scanner lukija, Henkilostorekisteri rekisteri) {
        this.lukija = lukija;
        this.rekisteri = rekisteri;
    }
    
    public void kaynnista() {
        
        System.out.println("Tervetuloa nimirekisteriin!");
        System.out.println();
        System.out.println("Komennot:");
        System.out.println("listaa - listaa kaikki henkilötiedot");
        System.out.println("abc - listaa kaikki henkilöt aakkosjärjestyksessä");
        System.out.println("arvot - kertoo kaikkien henkilöiden yhteisarvon");
        System.out.println("hae - hae arvo henkilön nimellä");
        System.out.println("lopeta - lopettaa ohjelman");
        
        
        while (true) {
            System.out.println();
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("listaa")) {
                listaa();
            } else if (komento.equals("abc")) {
                abc();
            } else if (komento.equals("arvot")) {
                arvot();
            } else if (komento.equals("hae")) {
                hae();
            } else {
                System.out.println("Tuntemanton komento!");
            }
        }
    }
    
    public void listaa() {
        this.rekisteri.tulostaArvonMukaan();
    }
    
    public void abc() {
        this.rekisteri.tulostaNimenMukaan();
    }
    
    public void arvot() {
        System.out.println(this.rekisteri.arvotYhteensa());
    }
    
    public void hae() {
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        if (this.rekisteri.haeArvoNimella(nimi) == -1) {
            System.out.println("Nimi ei ole rekisterissä");
        } else {
            System.out.println(this.rekisteri.haeArvoNimella(nimi));
        }
    }
}
