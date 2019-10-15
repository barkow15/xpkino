package philip_lasse_christian_gustav_sofie.xpkino.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KvitteringController {
    @GetMapping("/kvittering")
    public String kvittering(){
        return "kvittering";
    }
}
