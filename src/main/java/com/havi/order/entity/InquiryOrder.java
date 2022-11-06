package com.havi.order.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class InquiryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long payment;
    private Long farmerId;
    private String paymentStatus;
    private Long address;
    private LocalDateTime time;
    private Long email;
    private String customerStatus;
    private LocalDateTime customerReceiveTime;
    private Long orderCode;
    private String farmerGivenStatus;
    private Long contact;
    private Integer quantity;
}
