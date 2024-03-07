package com.example.buildingcompany.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//TODO описать данную сущность и связь с TypeOfAssortment

@Entity(name = "assortment")
@Table(schema = "project", name = "assortment")
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor 
public class Assortment extends AbstractEntity{
    @Column
    private String name;

    @OneToMany(mappedBy = "assortment", fetch = FetchType.LAZY)
    private List<TypeOfAssortment> typeOfAssortmentList;

    //TODO подумать над типом данных
    @Column
    private String descriptioString;

    @Column
    private String imgString;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assortment that = (Assortment) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "name='" + name + '\'' +
                '}';
    }

}
