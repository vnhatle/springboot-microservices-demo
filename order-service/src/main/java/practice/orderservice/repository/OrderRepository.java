package practice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
