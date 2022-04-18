package tydi.ru.schedule.mvc.route;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }
}

