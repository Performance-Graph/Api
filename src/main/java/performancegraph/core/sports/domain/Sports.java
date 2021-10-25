package performancegraph.core.sports.domain;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sports")
public class Sports {
    @Id
    private Long sportsId;

    @Column(nullable = false)
    private String position;
    @Column(nullable = false)
    private String nationality;
    @Column(nullable = false)
    private int height;
    @Column(nullable = false)
    private int weight;
    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime createAt;
    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updateAt;
}
