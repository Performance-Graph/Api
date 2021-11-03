package performancegraph.core.player.domain;

import lombok.Getter;
import performancegraph.core.common.BaseEntity;
import performancegraph.core.sports.domain.Sports;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "player")
public class Player extends BaseEntity {
    @Id
    private Long playerId;

    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false, length = 30)
    private String position;
    @Column(nullable = false, length = 40)
    private String nationality;
    @Column(nullable = false)
    private int height;
    @Column(nullable = false)
    private int weight;
    @Column(nullable = false)
    private LocalDateTime birthdate;

    @JoinColumn(name = "sports_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sports sports;

    /*@JoinColumn(name = "team_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;*/

    /*@JoinColumn(name = "performance_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Performance performance;*/
}
