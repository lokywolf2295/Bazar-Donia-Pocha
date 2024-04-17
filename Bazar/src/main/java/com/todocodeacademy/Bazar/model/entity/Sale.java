package com.todocodeacademy.Bazar.model.entity;

import com.todocodeacademy.Bazar.model.entity.base.Base;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.List;

public class Sale extends Base {
    private Long code_sale;
    private LocalDate date_sale;
    private Double total;
    private String date;
    private String hour;
    private String payment_method;
    @OneToMany
    @JoinColumn(name = "product_id", nullable = false)
    private List<Product> list_product;
    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client one_client;
}
