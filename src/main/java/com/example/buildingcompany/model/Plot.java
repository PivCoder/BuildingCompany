package com.example.buildingcompany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "plot")
@Table(schema = "project", name = "plot")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plot extends Assortment{
    @Column
    private String address;

    @Column
    private double size;

    @Column
    private boolean electricity;

    @Column
    private boolean water;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plot that = (Plot) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Plot{" +
                "id='" + getId() + '\'' +
                "address='" + address + '\'' +
                ", size=" + size +
                ", electricity=" + electricity +
                ", water=" + water +
                '}';
    }
}
