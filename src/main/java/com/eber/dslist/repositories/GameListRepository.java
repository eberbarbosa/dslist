package com.eber.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eber.dslist.entities.GameList;
import com.eber.dslist.projections.GameMinProjection;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
	
	
}
