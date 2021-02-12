package SpringCRUDweek.Project.Repos;

import SpringCRUDweek.Project.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
