package Springbootlayers.Entity;

import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportsDTO {
	@GeneratedValue
	private Integer sid ;
	private String sname;
	private Integer sage;
	private Integer sjerseyNo; 
	
	

}
