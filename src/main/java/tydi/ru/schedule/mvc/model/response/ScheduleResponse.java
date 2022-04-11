package tydi.ru.schedule.mvc.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScheduleResponse {
    private String subjectName;
    private String teacherName;
    private String groupName;
    private int lessonNumber;
    private String auditorium;
}
