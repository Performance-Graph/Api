package performancegraph.core.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import performancegraph.core.common.Constant;
import performancegraph.core.player.service.PlayerService;

@Controller
@RequestMapping(Constant.PERFORMANCE_GRAPH_API_V1)
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
}
