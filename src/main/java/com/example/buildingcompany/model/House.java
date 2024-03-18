package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.PercentageOfReadiness;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "house")
@Table(schema = "project", name = "house")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House extends Assortment{
    @Column
    private double area;

    @Column
    private double heatedArea;

    @Column
    private int numberOfFloors;

    @ManyToOne(fetch = FetchType.LAZY)
    private HouseType houseType;

    @ManyToOne(fetch = FetchType.LAZY)
    private MaterialType materialType;

    @Enumerated(EnumType.STRING)
    @Column
    private PercentageOfReadiness percentageOfReadiness;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House that = (House) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + getId() + '\'' +
                "area=" + area +
                ", heatedArea=" + heatedArea +
                ", numberOfFloors=" + numberOfFloors +
                ", percentageOfReadiness=" + percentageOfReadiness +
                '}';
    }
}
