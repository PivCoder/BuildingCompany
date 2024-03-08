package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.ProposalType;
import com.example.buildingcompany.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Entity(name = "assortment")
@Table(schema = "project", name = "assortment")
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor 
public class Assortment extends AbstractEntity{
    @Column
    private String name;

    //TODO подумать над типом данных
    @Column
    private String description;

    @Column
    private String images;

    @Enumerated(EnumType.STRING)
    @Column
    private ProposalType type;

    @OneToMany(mappedBy = "assortment", fetch = FetchType.EAGER)
    private Set<Favor> favors;

    @OneToMany(mappedBy = "assortment", fetch = FetchType.EAGER)
    private Set<House> houses;

    @OneToMany(mappedBy = "assortment", fetch = FetchType.EAGER)
    private Set<Plot> plots;

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
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}