package Springbootlombok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Springbootlombok.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
