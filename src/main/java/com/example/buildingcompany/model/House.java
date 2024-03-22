package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.PercentageOfReadiness;
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

@Entity(name = "house")
@Table(schema = "project", name = "house")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class House extends Assortment {
    @Column
    private double area;

    @Column
    private double heatedArea;

    @Column
    private int numberOfFloors;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private HouseType houseType;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private MaterialType materialType;

    @Enumerated(EnumType.STRING)
    @Column
    private PercentageOfReadiness percentageOfReadiness;
}
