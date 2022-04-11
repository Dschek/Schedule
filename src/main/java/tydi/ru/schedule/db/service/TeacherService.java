package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.repo.SubjectDB;
import tydi.ru.schedule.db.repo.TeacherDB;

@Service
public class TeacherService {
    public static final Logger LOG = LoggerFactory.getLogger(TeacherService.class);
    private final TeacherDB teacherDB;

    @Autowired
    public TeacherService(TeacherDB teacherDB){
        this.teacherDB = teacherDB;
    }
}
