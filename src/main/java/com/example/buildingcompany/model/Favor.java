package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.TypeOfTimeLimit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "favor")
@Table(schema = "project", name = "favor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Favor extends Assortment {
    @Column
    private String area;

    @Column
    private boolean industrial;

    @Column
    private double price;

    @Column
    private int numberOfTimeUnits;

    @ManyToOne
    private FavorType favorType;

    @Enumerated(EnumType.STRING)
    @Column
    private TypeOfTimeLimit typeOfTimeLimit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favor that = (Favor) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Favor{" +
                "area='" + area + '\'' +
                ", industrial=" + industrial +
                ", price=" + price +
                ", numberOfTimeUnits=" + numberOfTimeUnits +
                ", typeOfTimeLimit=" + typeOfTimeLimit +
                '}';
    }
}