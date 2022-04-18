package tydi.ru.schedule.mvc.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/schedule")
public class Shedule {

    @GetMapping("/")
    public String getSchedulePage(@RequestParam String query){
        return "schedule";
    }
}
