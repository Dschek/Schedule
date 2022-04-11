package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tydi.ru.schedule.db.model.Schedule;

@Repository
public interface ScheduleDB extends CrudRepository<Schedule, Integer> {
}
