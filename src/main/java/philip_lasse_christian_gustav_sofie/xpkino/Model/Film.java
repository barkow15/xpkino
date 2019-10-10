package philip_lasse_christian_gustav_sofie.xpkino.Model;

public class Film {
    String Titel;
    String Beskrivelse;
    String Premieredato;
    double Spilletid; // Spilletid i sekunder med 2 decimaler
    double Billetpris;
    String Genre;
    int    Aldersgraense; // Minimum aldersgrænse
    String FilmPlakatBillede; // Reference til filmplakatbillede

    public Film(String titel, String beskrivelse, String premieredato, double spilletid, double billetpris, String genre, int aldersgraense, String filmPlakatBillede) {
        Titel = titel;
        Beskrivelse = beskrivelse;
        Premieredato = premieredato;
        Spilletid = spilletid;
        Billetpris = billetpris;
        Genre = genre;
        Aldersgraense = aldersgraense;
        FilmPlakatBillede = filmPlakatBillede;
    }

    public String getFilmPlakatBillede() {
        return FilmPlakatBillede;
    }

    public void setFilmPlakatBillede(String filmPlakatBillede) {
        FilmPlakatBillede = filmPlakatBillede;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getBeskrivelse() {
        return Beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        Beskrivelse = beskrivelse;
    }

    public String getPremieredato() {
        return Premieredato;
    }

    public void setPremieredato(String premieredato) {
        Premieredato = premieredato;
    }

    public double getSpilletid() {
        return Spilletid;
    }

    public void setSpilletid(double spilletid) {
        Spilletid = spilletid;
    }

    public double getBilletpris() {
        return Billetpris;
    }

    public void setBilletpris(double billetpris) {
        Billetpris = billetpris;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getAldersgraense() {
        return Aldersgraense;
    }

    public void setAldersgraense(int aldersgraense) {
        Aldersgraense = aldersgraense;
    }
}
