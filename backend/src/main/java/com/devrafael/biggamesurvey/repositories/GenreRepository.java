package com.devrafael.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.biggamesurvey.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
