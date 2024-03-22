package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.TypeOfTimeLimit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "favor")
@Table(schema = "project", name = "favor")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Favor extends Assortment {
    @Column
    private double area;

    @Column
    private boolean industrial;

    @Column
    private double price;

    @Column
    private int numberOfTimeUnits;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private FavorType favorType;

    @Enumerated(EnumType.STRING)
    @Column
    private TypeOfTimeLimit typeOfTimeLimit;
}