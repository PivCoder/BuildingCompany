package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.PercentageOfReadiness;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity(name = "house")
@Table(schema = "project", name = "house")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House extends AbstractEntity{
    @Column
    private double area;

    @Column
    private double heatedArea;

    @Column
    private int numberOfFloors;

    @OneToMany(mappedBy = "house", fetch = FetchType.LAZY)
    private List<HouseType> houseTypeList;

    @OneToMany(mappedBy = "house", fetch = FetchType.LAZY)
    private List<MaterialType> materialTypeList;

    @ManyToMany(mappedBy = "houses")
    private Set<Planning> plannings;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "assortment_id")
    private Assortment assortment;

    private PercentageOfReadiness percentageOfReadiness;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House that = (House) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", heatedArea=" + heatedArea +
                ", numberOfFloors=" + numberOfFloors +
                ", percentageOfReadiness=" + percentageOfReadiness +
                '}';
    }
}
