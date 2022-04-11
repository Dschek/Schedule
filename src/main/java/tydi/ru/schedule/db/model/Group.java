package tydi.ru.schedule.db.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Embeddable
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy="group")
    private List<Schedule> scheduleList;
}
