package tydi.ru.schedule.db.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="type")
    private int type;
}
