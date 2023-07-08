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
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service("shiva")
@Slf4j
@Primary
public class SportsService implements SportsInterface {
	@Autowired
	private SportsRepo repo;
	@Override
	public SportsMan saveSportsMan(SportsDTO man) {
	log.info(""+man);
		SportsMpper mapper=Mappers.getMapper(SportsMpper.class);
		SportsMan man2=mapper.saveSportsMan(man);
		log.info(""+man2);
		repo.save(man2);
		return man2;
	}
	
	
		

//	@Override
//	public SportsMan saveSportsMan(SportsDTO man) {
//	
////		SportsMan man2=new SportsMan(man.getSid(), man.getSname(), man.getSage(), man.getSjerseyNo());
////		repo.save(man2);
//		
//		SportsInterface mapper= Mappers.getMapper(SportsInterface.class);
//		SportsMan man2 =(SportsMan) mapper.saveSportsMan(man);
//		SportsMan man3=repo.save(man2);
//		return man3;
//	}

	@Override
	public SportsDTO saveSportsMan(Integer id) {
		
		Optional<SportsMan> man=repo.findById(id);
		
		SportsMpper mapper= Mappers.getMapper(SportsMpper.class);
		
		
		return mapper.getById(man.get());
		
		
	
	}

	@Override
	public List<SportsDTO> getAllSportsMan() {
		List<SportsMan> man=repo.findAll();
		SportsMpper mapper=Mappers.getMapper(SportsMpper.class);
		List<SportsDTO> dtos=mapper.sportsMansToSportsDTOs(man);
		return dtos;
	}
	
	
}
