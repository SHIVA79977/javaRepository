package Springbootlombok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;

	
	
	
	
}
