
import java.util.Comparator;
import java.util.Objects;

public class Henkilo {
    
    private String nimi;
    private int arvo;
    
    public Henkilo(String nimi, int arvo) {
        this.nimi = nimi;
        this.arvo = arvo;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getArvo() {
        return this.arvo;
    }
    
    public static Comparator<Henkilo> ArvojenVertaaja = (Henkilo a1, Henkilo a2) -> {
        int arvo1 = a1.getArvo();
        int arvo2 = a2.getArvo();
        
        return arvo2-arvo1;
    };
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.arvo + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Henkilo other = (Henkilo) obj;
        if (this.arvo != other.arvo) {
            return false;
        }
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        return true;
    }
}
