package tydi.ru.schedule.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tydi.ru.schedule.db.repo.SubjectDB;

@Service
public class SubjectService {
    public static final Logger LOG = LoggerFactory.getLogger(SubjectService.class);
    private final SubjectDB subjectDB;

    @Autowired
    public SubjectService(SubjectDB subjectDB){
        this.subjectDB = subjectDB;
    }
}
