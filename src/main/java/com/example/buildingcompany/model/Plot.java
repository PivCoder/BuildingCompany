package com.example.buildingcompany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "plot")
@Table(schema = "project", name = "plot")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Plot extends Assortment {
    @Column
    private String address;

    @Column
    private double size;

    @Column
    private boolean electricity;

    @Column
    private boolean water;

    @Column
    private double price;
}
