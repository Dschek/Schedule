package tydi.ru.schedule.db.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
@Table(name="group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
//    @OneToMany(mappedBy="group")
//    private List<Schedule> scheduleList;
}
