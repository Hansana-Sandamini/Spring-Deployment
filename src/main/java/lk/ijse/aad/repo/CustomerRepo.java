package lk.ijse.aad.repo;

import lk.ijse.aad.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
    boolean existsById(Long id);
}
