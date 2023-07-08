package Springbootlayers.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsMan {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private Integer jerseyNo;
	
	

	
	

}
