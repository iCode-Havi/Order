package com.havi.order.repository;
import com.havi.order.entity.OrderWithoutTransport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderWithoutTransportRepository extends JpaRepository<OrderWithoutTransport , Long> {

}
