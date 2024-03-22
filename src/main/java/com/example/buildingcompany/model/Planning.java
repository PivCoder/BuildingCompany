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

//TODO выяснить и дополнить поля

@Entity(name = "planning")
@Table(schema = "project", name = "planning")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Planning extends Assortment {

    @Column
    private double length;

    @Column
    private double width;
}
