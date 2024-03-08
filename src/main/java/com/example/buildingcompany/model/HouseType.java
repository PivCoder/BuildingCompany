package com.example.buildingcompany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "house_type")
@Table(schema = "project", name = "house_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HouseType extends AbstractEntity{
    @Column
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id")
    private House house;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseType that = (HouseType) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "name='" + name + '\'' +
                '}';
    }
}
