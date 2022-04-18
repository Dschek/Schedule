package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.model.Schedule;
import tydi.ru.schedule.db.model.Teacher;
import tydi.ru.schedule.db.repo.SubjectDB;
import tydi.ru.schedule.db.repo.TeacherDB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class TeacherService {
    public static final Logger LOG = LoggerFactory.getLogger(TeacherService.class);
    private final TeacherDB teacherDB;

    @Autowired
    public TeacherService(TeacherDB teacherDB){
        this.teacherDB = teacherDB;
    }

    public Teacher findTeacherByName(String name){
        try{
            return teacherDB.findByName(name).get();
        }catch (Exception e){
            return null;
        }
    }

    public List<Schedule> findScheduleByTeacherName(String name){
        Teacher teacher = findTeacherByName(name);
        if(teacher == null)
            return null;
        List<Schedule> result = new LinkedList<>();
        teacher.getSubjectsList().stream().forEach(elem->result.addAll(elem.getScheduleList()));
        return result;
    }
}
