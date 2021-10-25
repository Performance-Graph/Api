package performancegraph.core.sports.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
public class Sports {
    @Id
    private Long sportsId;
}
