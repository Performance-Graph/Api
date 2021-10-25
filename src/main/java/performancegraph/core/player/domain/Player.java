package performancegraph.core.player.domain;

import performancegraph.core.sports.domain.Sports;

import javax.persistence.*;


@Entity
@Table(name = "player")
public class Player {
    @Id
    private Long playerId;

    @JoinColumn(name = "sports_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sports sports;
}
