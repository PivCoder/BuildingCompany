package com.example.buildingcompany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "type_of_time_limit")
@Table(schema = "project", name = "type_of_time_limit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfTimeLimit extends AbstractEntity{
    @Column
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "favor_id")
    private Favor favor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfTimeLimit that = (TypeOfTimeLimit) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TypeOfTimeLimit{" +
                "name='" + name + '\'' +
                '}';
    }
}
