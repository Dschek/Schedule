package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.repo.GroupDB;

@Service
public class GroupService {
    public static final Logger LOG = LoggerFactory.getLogger(GroupService.class);
    private final GroupDB groupDB;

    @Autowired
    public GroupService(GroupDB groupDB){
        this.groupDB = groupDB;
    }

}
