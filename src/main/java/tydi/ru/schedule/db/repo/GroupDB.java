package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tydi.ru.schedule.db.model.Group;

@Repository
public interface GroupDB extends CrudRepository<Group, Integer> {
}
