package com.havi.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class PreviousCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prevCustomerId;
    private Long contact;
    private String email;
    private String address;
}
