package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tydi.ru.schedule.db.model.Teacher;

@Repository
public interface TeacherDB extends CrudRepository<Teacher, Integer> {
}
