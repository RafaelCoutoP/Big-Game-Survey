package com.devrafael.biggamesurvey.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devrafael.biggamesurvey.dto.RecordDTO;
import com.devrafael.biggamesurvey.dto.RecordInsertDTO;
import com.devrafael.biggamesurvey.entities.Game;
import com.devrafael.biggamesurvey.entities.Record;
import com.devrafael.biggamesurvey.repositories.GameRepository;
import com.devrafael.biggamesurvey.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
 	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}