package tydi.ru.schedule.mvc.route;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tydi.ru.schedule.mvc.model.response.ScheduleDayResponse;

import java.util.List;

@Controller
public class Home {
    @GetMapping("/")
    public ResponseEntity<List<ScheduleDayResponse>> getSchedule() {

        return "";
    }
}
