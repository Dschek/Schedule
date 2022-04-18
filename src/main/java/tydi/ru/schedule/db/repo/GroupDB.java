package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tydi.ru.schedule.db.model.Group;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupDB extends CrudRepository<Group, Integer> {
    Optional<Group> findByName(String name);
}
