package tydi.ru.schedule.mvc.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import tydi.ru.schedule.db.model.Schedule;
import tydi.ru.schedule.db.service.GroupService;
import tydi.ru.schedule.db.service.TeacherService;
import tydi.ru.schedule.mvc.converter.ScheduleConverter;
import tydi.ru.schedule.mvc.model.response.ScheduleDayResponse;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/schedule")
public class Shedule {
    @Autowired
    private GroupService groupService;
    @Autowired
    private TeacherService teacherService;

    @GetMapping("")
    public String getSchedulePage(@RequestParam String query, Model model){
        List<ScheduleDayResponse> scheduleDayResponses = getScheduleByTeacherOrGroupName(query);
        if(scheduleDayResponses == null)
            return "index";
        model.addAttribute(scheduleDayResponses);
        return "schedule";
    }
    @GetMapping("/api")
    public List<ScheduleDayResponse> getSchedule(@RequestParam String query, Model model){
        List<ScheduleDayResponse> scheduleDayResponses = getScheduleByTeacherOrGroupName(query);
        if(scheduleDayResponses == null)
            return new ArrayList<>();
        return scheduleDayResponses;
    }

    private List<ScheduleDayResponse> getScheduleByTeacherOrGroupName(String name){
        if(StringUtils.isEmpty(name))
            return null;
        List<Schedule> schedules = groupService.findScheduleByGroup(name);
        if(schedules == null)
            schedules = teacherService.findScheduleByTeacherName(name);
        return ScheduleConverter.toScheduleDayResponse(schedules);
    }
}
