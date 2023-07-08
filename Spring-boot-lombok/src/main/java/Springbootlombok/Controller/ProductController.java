package Springbootlombok.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Springbootlombok.Repository.ProductRepo;
import Springbootlombok.entity.Product;
import Springbootlombok.entity.Productdto;
import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class ProductController {
	@Autowired
	private ProductRepo repo;
	@PostMapping("saveproduct")
	public Product save(@RequestBody Productdto product) {
		Product p=Product.build(0, product.getName(), product.getPrice());
	
		Product product2=repo.save(p);
	
		return product2;
		
		
		
	}

}
