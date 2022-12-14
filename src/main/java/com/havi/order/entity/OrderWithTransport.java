package com.havi.order.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderWithTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long TransporterId;
    private Long orderCode;
    private Integer quantity;
    private String customerStatus;
    private LocalDateTime time;
    private String address;
    private Long email;
    private LocalDateTime customerReceiveTime;
    private Long payment;
    private Long contact;
    private String farmerGivenStatus;
    private LocalDateTime transporterRecieveTime;
    private LocalDateTime transporterGivenTime;
    private String transporterStatus;





}
