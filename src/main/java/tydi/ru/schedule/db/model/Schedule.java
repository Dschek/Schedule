package tydi.ru.schedule.db.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
//    @ManyToOne
//    @JoinColumn (name="group_id")
//    private Group group;
//    @ManyToOne()
//    @JoinColumn (name="subject_id")
//    private Subject subject;
    @Column(name="lessonnumber")
    private int lessonNumber;
    @Column(name="daynumber")
    private int dayNumber;
    @Column(name="auditorium")
    private String auditorium;
}
