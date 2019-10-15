package philip_lasse_christian_gustav_sofie.xpkino.Model;
import java.util.List;

public class SaedeRaekke {
    private int         Nummer;
    private List<Saede> Saeder;

    public SaedeRaekke(int nummer, List<Saede> saeder) {
        Nummer = nummer;
        Saeder = saeder;
    }
    public int getNummer() {
        return Nummer;
    }

    public void setNummer(int nummer) {
        Nummer = nummer;
    }

    public List<Saede> getSaeder() {
        return Saeder;
    }

    public void setSaeder(List<Saede> saeder) {
        Saeder = saeder;
    }
}
