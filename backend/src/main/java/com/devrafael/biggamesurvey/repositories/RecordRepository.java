package com.devrafael.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrafael.biggamesurvey.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
