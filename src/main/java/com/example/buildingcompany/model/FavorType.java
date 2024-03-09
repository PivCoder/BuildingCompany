package com.example.buildingcompany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "favor_type")
@Table(schema = "project", name = "favor_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavorType extends AbstractEntity{
    @Column
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavorType that = (FavorType) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "FavorType{" +
                "name='" + name + '\'' +
                '}';
    }
}
