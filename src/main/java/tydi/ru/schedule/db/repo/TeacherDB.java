package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tydi.ru.schedule.db.model.Teacher;

import java.util.Optional;

@Repository
public interface TeacherDB extends CrudRepository<Teacher, Integer> {
    Optional<Teacher> findByName(String name);
}
