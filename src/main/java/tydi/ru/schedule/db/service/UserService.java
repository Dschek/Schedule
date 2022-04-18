package tydi.ru.schedule.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.repo.UserDB;

@Service
public class UserService {
    @Autowired
    private UserDB userDB;

    public UserService(UserDB userDB){
        this.userDB = userDB;
    }
}
