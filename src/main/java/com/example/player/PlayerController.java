package com.example.player;

import java.util.*;
import com.example.player.Player;
import com.example.player.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    PlayerService playerservice = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {

        return playerservice.getPlayers();

    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerservice.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerservice.addPlayer(player);

    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerservice.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable int playerId) {
        playerservice.deletePlayer(playerId);
    }

}
