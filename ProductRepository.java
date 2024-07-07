package FinalProject.OnlineMarket.repository;

import FinalProject.OnlineMarket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
