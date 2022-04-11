package tydi.ru.schedule.mvc.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDayResponse {
    private int dayNumber;
    private List<ScheduleResponse> schedules;
}
