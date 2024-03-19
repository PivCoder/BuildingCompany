package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

//TODO Переделать везде FullArgCOnstructor руками, добавить в toString() id

@Entity(name = "favor_type")
@Table(schema = "project", name = "favor_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "favor_type_seq", allocationSize = 1)
public class FavorType extends AbstractEntity{
    @Column
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "favorType", cascade = CascadeType.ALL)
    private List<Favor> favorList;

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
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
