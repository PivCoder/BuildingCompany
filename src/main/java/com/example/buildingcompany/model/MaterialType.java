package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity(name = "material_type")
@Table(schema = "project", name = "material_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "material_type_seq", allocationSize = 1)
public class MaterialType extends AbstractEntity{
    @Column
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "materialType", cascade = CascadeType.ALL)
    private List<House> houseList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialType that = (MaterialType) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "MaterialType{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
