package com.devrafael.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.biggamesurvey.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
