package com.example.buildingcompany.model;

import jakarta.persistence.*;
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
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfAssortment that = (TypeOfAssortment) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TypeOfAssortment{" +
                "name='" + name + '\'' +
                '}';
    }
}
