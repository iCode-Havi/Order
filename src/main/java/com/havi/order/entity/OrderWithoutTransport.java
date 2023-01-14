package com.havi.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderWithoutTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productOrderId;
    private String orderCode;
    private Integer orderQuantity;
    private String customerStatus;
    private LocalDateTime orderTime;
    private String orderAddress;
    private String email;
    private LocalDateTime customerReceiveTime;
    private Double orderPayment;
    private String contactNo;
    private String farmerGivenStatus;


}
