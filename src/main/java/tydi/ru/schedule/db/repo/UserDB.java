package tydi.ru.schedule.db.repo;

import org.springframework.data.repository.CrudRepository;
import tydi.ru.schedule.db.model.User;

public interface UserDB extends CrudRepository<User, Integer> {
}
