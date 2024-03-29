package com.havi.order.repository;
import com.havi.order.entity.OrderWithoutTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderWithoutTransportRepository extends JpaRepository<OrderWithoutTransport , Long> {
    Optional<OrderWithoutTransport> findByOrderCode(String code);
}
