package philip_lasse_christian_gustav_sofie.xpkino.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import philip_lasse_christian_gustav_sofie.xpkino.Model.Film;

import java.util.ArrayList;

@Controller
public class FilmskemaController {
    @GetMapping("/filmskema")
    public String filmskema(Model model){
        ArrayList<Film> filmListe = new ArrayList<>();

        Film rambo2 = new Film(
                "Rambo 2",
                "En herlig film",
                "20-10-2019",
                120.00,
                75,
                "Action",
                18,
                "dummy"
        );
        Film diehard3 = new Film(
                "Die Hard 3",
                "En herlig film",
                "21-10-2019",
                120.00,
                75,
                "Action",
                18,
                "dummy"
        );


        filmListe.add(rambo2);
        filmListe.add(diehard3);

        model.addAttribute("filmListe", filmListe);

        return "filmskema";
    }
}
