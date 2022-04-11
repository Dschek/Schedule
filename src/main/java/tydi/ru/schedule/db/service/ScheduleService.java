package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.repo.ScheduleDB;

@Service
public class ScheduleService {
    public static final Logger LOG = LoggerFactory.getLogger(GroupService.class);
    private final ScheduleDB scheduleDB;

    @Autowired
    public ScheduleService(ScheduleDB scheduleDB){
        this.scheduleDB = scheduleDB;
    }
}
