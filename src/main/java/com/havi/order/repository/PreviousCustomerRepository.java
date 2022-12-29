package com.havi.order.repository;
import com.havi.order.entity.PreviousCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreviousCustomerRepository extends JpaRepository<PreviousCustomer, Long> {

}