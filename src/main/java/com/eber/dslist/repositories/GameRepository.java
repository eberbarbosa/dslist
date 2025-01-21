package com.eber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eber.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
