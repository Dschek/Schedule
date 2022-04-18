package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.model.Group;
import tydi.ru.schedule.db.model.Schedule;
import tydi.ru.schedule.db.repo.GroupDB;

import java.util.List;

@Service
public class GroupService {
    public static final Logger LOG = LoggerFactory.getLogger(GroupService.class);
    private final GroupDB groupDB;

    @Autowired
    public GroupService(GroupDB groupDB){
        this.groupDB = groupDB;
    }

    public Group findGroupByName(String name){
        try {
            return groupDB.findByName(name).get();
        }catch (Exception e){
            return null;
        }
    }
     public List<Schedule> findScheduleByGroup(String name){
        Group group = findGroupByName(name);
        if(group == null)
            return null;
        return group.getScheduleList();
     }
}
