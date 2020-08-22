package pt.jarpsimoes.example.springboot.repositories;

import pt.jarpsimoes.example.springboot.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
