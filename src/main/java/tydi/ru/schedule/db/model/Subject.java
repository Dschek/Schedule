package tydi.ru.schedule.db.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Embeddable
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne()
    @JoinColumn (name="teacher_id")
    private Teacher teacher;
    @OneToMany(mappedBy="subject")
    private List<Schedule> scheduleList;
}
