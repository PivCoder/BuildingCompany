package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity(name = "house_type")
@Table(schema = "project", name = "house_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "house_type_seq", allocationSize = 1)
public class HouseType extends AbstractEntity{
    @Column
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "houseType", cascade = CascadeType.ALL)
    private List<House> houseList;

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
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
