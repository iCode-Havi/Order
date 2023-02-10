package com.havi.order.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderWithTransport extends OrderWithoutTransport{
    private LocalDateTime transporterReceiveTime;
    private LocalDateTime transporterGivenTime;
    private String transporterStatus;
    private LocalDateTime offerEndTime;
    private String orderTransportType;
    private Long transporterId;
}
