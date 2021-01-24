
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
        
        Henkilo ville = new Henkilo("Ville", 24); 
        Henkilo anna = new Henkilo("Anna", 6);
        Henkilo antti = new Henkilo("Antti", 22);
        Henkilo sanna = new Henkilo("Sanna", 5);
        Henkilo mikko = new Henkilo("Mikko", 19);
        Henkilo minna = new Henkilo("Minna", 5);
        Henkilo timo = new Henkilo("Timo", 22);
        Henkilo satu = new Henkilo("Satu", 5);
        Henkilo tuomas = new Henkilo("Tuomas", 16);
        Henkilo tiina = new Henkilo("Tiina", 5);
        Henkilo tero = new Henkilo("Tero", 15);
        Henkilo kati = new Henkilo("Kati", 5);
        Henkilo sami = new Henkilo("Sami", 15);
        Henkilo henna = new Henkilo("Henna", 4);
        Henkilo mika = new Henkilo("Mika", 12);
        Henkilo liisa = new Henkilo("Liisa", 4);
        Henkilo janne = new Henkilo("Janne", 12);
        Henkilo paula = new Henkilo("Paula", 4);
        Henkilo petri = new Henkilo("Petri", 11);
        Henkilo suvi = new Henkilo("Suvi", 4);
        
        valiaikainen.lisaa(ville);
        valiaikainen.lisaa(anna);
        valiaikainen.lisaa(antti);
        valiaikainen.lisaa(sanna);
        valiaikainen.lisaa(mikko);
        valiaikainen.lisaa(minna);
        valiaikainen.lisaa(timo);
        valiaikainen.lisaa(satu);
        valiaikainen.lisaa(tuomas);
        valiaikainen.lisaa(tiina);
        valiaikainen.lisaa(tero);
        valiaikainen.lisaa(kati);
        valiaikainen.lisaa(sami);
        valiaikainen.lisaa(henna);
        valiaikainen.lisaa(mika);
        valiaikainen.lisaa(liisa);
        valiaikainen.lisaa(janne);
        valiaikainen.lisaa(paula);
        valiaikainen.lisaa(petri);
        valiaikainen.lisaa(suvi);
        
        return valiaikainen;
    }
    
}
