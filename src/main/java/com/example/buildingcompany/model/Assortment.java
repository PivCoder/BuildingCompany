package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "assortment")
@Table(schema = "project", name = "assortment")
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "default_gen", sequenceName = "assortment_seq", allocationSize = 1)
public abstract class Assortment extends AbstractEntity{

    @Column
    private String name;

    //TODO подумать над типом данных
    @Column
    private String description;

    @Column
    private String images;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assortment that = (Assortment) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                ", status=" + status +
                '}';
    }
}