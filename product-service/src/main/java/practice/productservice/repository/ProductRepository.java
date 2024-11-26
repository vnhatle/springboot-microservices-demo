package practice.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import practice.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
