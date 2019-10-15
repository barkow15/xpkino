package philip_lasse_christian_gustav_sofie.xpkino.Model;

import java.util.List;

public class Sal {
    private String Navn;
    private List<SaedeRaekke> SaedeRaekke;

    public Sal(String navn, List<SaedeRaekke> saedeRaekke) {
        Navn = navn;
        SaedeRaekke = saedeRaekke;
    }
    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public List<SaedeRaekke> getSaedeRaekke() {
        return SaedeRaekke;
    }

    public void setSaedeRaekke(List<SaedeRaekke> saedeRaekke) {
        SaedeRaekke = saedeRaekke;
    }
}
