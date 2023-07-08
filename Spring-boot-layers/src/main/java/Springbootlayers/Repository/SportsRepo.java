package Springbootlayers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Springbootlayers.Entity.SportsMan;
@Repository
public interface SportsRepo  extends JpaRepository<SportsMan, Integer>{

}
