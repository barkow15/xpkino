package philip_lasse_christian_gustav_sofie.xpkino.Model;

public class Forestilling {
    Film    Film;
    String  Dato;
    String  StartTidspunkt;
    String  SlutTidspunkt;

    public Forestilling(Film film, String dato, String startTidspunkt, String slutTidspunkt) {
        Film = film;
        Dato = dato;
        StartTidspunkt = startTidspunkt;
        SlutTidspunkt = slutTidspunkt;
    }

    public Film getFilm() {
        return Film;
    }

    public void setFilm(philip_lasse_christian_gustav_sofie.xpkino.Model.Film film) {
        Film = film;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String dato) {
        Dato = dato;
    }

    public String getStartTidspunkt() {
        return StartTidspunkt;
    }

    public void setStartTidspunkt(String startTidspunkt) {
        StartTidspunkt = startTidspunkt;
    }

    public String getSlutTidspunkt() {
        return SlutTidspunkt;
    }

    public void setSlutTidspunkt(String slutTidspunkt) {
        SlutTidspunkt = slutTidspunkt;
    }
}
