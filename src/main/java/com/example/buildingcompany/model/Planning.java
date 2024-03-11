package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Entity(name = "planning")
@Table(schema = "project", name = "planning")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Planning extends AbstractEntity{
    @Column
    private String name;

    @Column
    private String images;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "house_planning",
            joinColumns = @JoinColumn(name = "planning_id"),
            inverseJoinColumns = @JoinColumn(name = "house_id"))
    private Set<House> houses;

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
                "name='" + name + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
