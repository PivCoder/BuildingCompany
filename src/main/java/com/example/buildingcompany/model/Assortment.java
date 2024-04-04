package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "assortment")
@Table(schema = "project", name = "assortment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "default_gen", sequenceName = "assortment_seq", allocationSize = 1)
public abstract class Assortment extends AbstractEntity {

    @Column
    private String name;

    //TODO подумать над типом данных
    @Column
    private String description;

    @Column
    private String images;

    @Column
    private String image;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
}