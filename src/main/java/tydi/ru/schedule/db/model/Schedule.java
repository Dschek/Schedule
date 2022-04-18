package tydi.ru.schedule.db.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Embeddable
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name="group_id")
    private Group group;
    @ManyToOne()
    @JoinColumn (name="subject_id")
    private Subject subject;
    private int lessonNumber;
    private int dayNumber;
    private String auditorium;
}
