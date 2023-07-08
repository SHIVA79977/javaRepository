package Springbootlayers.Srevice;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import Springbootlayers.Entity.SportsDTO;
import Springbootlayers.Entity.SportsMan;
import Springbootlayers.Repository.SportsRepo;
import lombok.extern.slf4j.Slf4j;

@Service

@Slf4j
public class MangoDB implements SportsInterface{
	
	@Autowired
	private SportsRepo repo;
	


	@Override
	public SportsDTO saveSportsMan(Integer id) {
		Optional<SportsMan> man=repo.findById(id);
		
		SportsDTO dto= new SportsDTO(man.get().getId(), man.get().getName(), man.get().getAge(), man.get().getJerseyNo());
		
		
		return dto;
	}


	public SportsMan saveSportsMan(SportsDTO man) {
	log.info(""+man);
		SportsMpper mapper=Mappers.getMapper(SportsMpper.class);
		SportsMan man2=mapper.saveSportsMan(man);
		log.info(""+man2);
		repo.save(man2);
		return man2;
	}


@Override
public List<SportsDTO> getAllSportsMan() {
	// TODO Auto-generated method stub
	return null;
}
	

}
