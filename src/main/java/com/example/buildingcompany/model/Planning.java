package com.example.buildingcompany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

//TODO выяснить и дополнить поля

@Entity(name = "planning")
@Table(schema = "project", name = "planning")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Planning extends Assortment {

    @Column
    private double length;

    @Column
    private double width;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planning that = (Planning) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Planning{" +
                "id='" + getId() + '\'' +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
