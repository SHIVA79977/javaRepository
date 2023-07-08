package Springbootlayers.Srevice;

import java.util.List;


import org.springframework.stereotype.Repository;

import Springbootlayers.Entity.SportsDTO;
import Springbootlayers.Entity.SportsMan;


@Repository

public interface SportsInterface {
	
	public SportsMan saveSportsMan( SportsDTO man);
	
	public SportsDTO saveSportsMan( Integer id);
	
	public List<SportsDTO> getAllSportsMan( );
	
}
