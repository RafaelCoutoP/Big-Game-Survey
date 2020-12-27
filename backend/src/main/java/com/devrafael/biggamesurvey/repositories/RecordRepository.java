package com.devrafael.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.biggamesurvey.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
