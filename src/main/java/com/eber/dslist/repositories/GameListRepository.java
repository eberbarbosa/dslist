package com.eber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eber.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long> {

}
