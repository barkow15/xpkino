package philip_lasse_christian_gustav_sofie.xpkino.Model;

public class Kvittering {
    private String Dato;
    private double Beloeb;
    private int Antal;
    private int Ordrenummer;



    public Kvittering(String dato, double beloeb, int antal, int ordrenummer){
        Dato = dato;
        Beloeb = beloeb;
        Antal = antal;
        Ordrenummer = ordrenummer;
    }
    public String getDato() {
        return Dato;
    }

    public void setDato(String dato) {
        Dato = dato;
    }

    public double getBeloeb() {
        return Beloeb;
    }

    public void setBeloeb(double beloeb) {
        Beloeb = beloeb;
    }

    public int getAntal() {
        return Antal;
    }

    public void setAntal(int antal) {
        Antal = antal;
    }

    public int getOrdrenummer() {
        return Ordrenummer;
    }

    public void setOrdrenummer(int ordrenummer) {
        Ordrenummer = ordrenummer;
    }
}
