package com.example.buildingcompany.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "typeOfAssortment")
@Table(schema = "project", name = "typeOfAssortment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfAssortment extends AbstractEntity{
    @Column
    String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "assortment_id")
    private Assortment assortment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfAssortment that = (TypeOfAssortment) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "TypeOfAssortment{" +
                "name='" + name + '\'' +
                '}';
    }
}
