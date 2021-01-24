
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Henkilostorekisteri {
    
    private ArrayList<Henkilo> rekisteri;
    
    public Henkilostorekisteri() {
        this.rekisteri = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.rekisteri.add(henkilo);
    }
    
    public boolean onTyhja() {
        return this.rekisteri.isEmpty();
    }
    
    public ArrayList<Henkilo> getRekisteri() {
        return this.rekisteri;
    }
    
    public Henkilo isoinArvo() {
        if (this.rekisteri.isEmpty()) {
            return null;
        }
        
        Henkilo palautettava = this.rekisteri.get(0);
        for (Henkilo hlo: this.rekisteri) {
            if (hlo.getArvo() > palautettava.getArvo()) {
                palautettava = hlo;
            }
        }
        
        return palautettava;
    }
    
    public int haeArvoNimella(String nimi) {
        for (Henkilo hlo: this.rekisteri) {
            if (hlo.getNimi().equals(nimi)) {
                return hlo.getArvo();
            }
        }
        
        return -1;
    }
    
    public int arvotYhteensa() {
        int summa = 0;
        for (Henkilo hlo: this.rekisteri) {
            summa += hlo.getArvo();
        }
        
        return summa;
    }
    
    public void tulostaArvonMukaan() {
        Collections.sort(this.rekisteri, Henkilo.ArvojenVertaaja);
        for (Henkilo hlo: this.rekisteri) {
            System.out.println(hlo);
        }
    }
    
    public void tulostaNimenMukaan() {
        Comparator<Henkilo> vertaileNimella =
                (Henkilo a1, Henkilo a2) -> a1.getNimi().compareTo(a2.getNimi());
        
        Collections.sort(this.rekisteri, vertaileNimella);
        for (Henkilo hlo: this.rekisteri) {
            System.out.println(hlo.getNimi());
        }
    }
    
}
