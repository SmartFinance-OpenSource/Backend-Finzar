package pe.edu.upc.smartfinance.finzar.wallets.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.smartfinance.finzar.wallets.domain.model.entities.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    boolean existsByName(String name);
    Optional<Category> findById(Long id);
    Optional<Category> findByName(String name);
}
