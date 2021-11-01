package performancegraph.core.player.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import performancegraph.core.player.domain.Player;
import performancegraph.core.player.dto.GetAllPlayerResponse;
import performancegraph.core.player.repository.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public GetAllPlayerResponse getALl(int page, int size) {
         Page<Player> players = playerRepository.findAll(PageRequest.of(page, size));

         return new GetAllPlayerResponse(players.getTotalElements(), page, players.getContent());
    }

    public Player getPlayerById(Long playerId) {
        return playerRepository.findByPlayerId(playerId);
    }

    public Player getPlayerByName(String name) {

    }
}
