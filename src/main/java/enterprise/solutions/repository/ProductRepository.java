package enterprise.solutions.repository;


import enterprise.solutions.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByProductName(String productName);
}
