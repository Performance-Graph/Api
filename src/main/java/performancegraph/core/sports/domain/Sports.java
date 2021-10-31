package performancegraph.core.sports.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import performancegraph.core.common.BaseEntity;
import performancegraph.core.common.Constant;

@Getter
@Entity
@Table(name = "sports")
public class Sports extends BaseEntity{
    @Id
    private Long sportsId;

    @Column(nullable = false, length = Constant.IMAGE_URL_MAX_LENGTH)
    private String imageUrl;
}
