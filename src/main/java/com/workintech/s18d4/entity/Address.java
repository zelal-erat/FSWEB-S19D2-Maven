package com.workintech.s18d4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private long id;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "no")
    private int no;
    @Column(name = "description")
    private String description;
    @Column(name = "country")
    private String country;



    @OneToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private Customer customer;
}

