package tydi.ru.schedule.db.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Embeddable
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjectsList;
    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjectList;
}
