package com.havi.order.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "product_order")
public class ProductOrder {
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
    private LocalDateTime transporterReceiveTime;
    private LocalDateTime transporterGivenTime;
    private String transporterStatus;
    private LocalDateTime offerEndTime;
}
