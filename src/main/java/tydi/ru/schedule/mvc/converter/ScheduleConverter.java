package tydi.ru.schedule.mvc.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tydi.ru.schedule.db.model.Schedule;
import tydi.ru.schedule.db.service.SubjectService;
import tydi.ru.schedule.mvc.model.response.ScheduleDayResponse;
import tydi.ru.schedule.mvc.model.response.ScheduleResponse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleConverter {
    public static final Logger LOG = LoggerFactory.getLogger(SubjectService.class);

    public static List<ScheduleDayResponse> toScheduleDayResponse(List<Schedule> schedule) {
            List<ScheduleDayResponse> result = new ArrayList<>(12);
        try {
            List<ScheduleResponse> schedules = new ArrayList<>(6);
            int index = 0;
            schedule.stream()
                    .sorted(Comparator.comparing(Schedule::getDayNumber).thenComparing(Schedule::getLessonNumber))
                    .forEach(elem -> {
                                if (elem.getDayNumber() > index) {
                                    result.add(new ScheduleDayResponse(index, schedules));
                                    schedules.clear();
                                }
                                schedules.add(new ScheduleResponse(elem.getSubject().getName(), elem.getSubject().getTeacher().getName(), elem.getGroup().getName(), elem.getLessonNumber(), elem.getAuditorium()));
                            }
                    );
        }catch (Exception e){
            LOG.error("Can not be convert.", e);
        }
        return result;
    }

}
