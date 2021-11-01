package performancegraph.core.player.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import performancegraph.core.player.domain.Player;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetAllPlayerResponse {
    private Long totalCount;
    private int currentPage;
    List<Player> playerList;

    public GetAllPlayerResponse(Long totalCount, int currentPage, List<Player> playerList) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.playerList = playerList;
    }
}
