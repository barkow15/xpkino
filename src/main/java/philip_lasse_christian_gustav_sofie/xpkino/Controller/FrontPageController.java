package philip_lasse_christian_gustav_sofie.xpkino.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {
    @GetMapping("/")
    public String index(){
        return "movies";
    }
}