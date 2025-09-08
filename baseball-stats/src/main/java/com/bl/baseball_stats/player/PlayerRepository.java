package com.bl.baseball_stats.player;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, String> {
    void deletePlayerByName(String player);
    Optional<Player> findByName(String player);
}
