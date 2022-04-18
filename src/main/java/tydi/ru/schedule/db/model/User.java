package tydi.ru.schedule.db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Embeddable
@Entity
@Table
public class User {
    private int userId;
    private String email;
    private String password;
    private int type;
}
