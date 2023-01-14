package com.havi.order.repository;
import com.havi.order.entity.PreviousCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousCustomerRepository extends JpaRepository<PreviousCustomer, Long> {

}