package com.havi.order.entity;

import lombok.*;

import java.time.LocalDateTime;


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
