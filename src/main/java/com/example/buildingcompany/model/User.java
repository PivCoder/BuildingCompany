package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity(name = "application_user")
@Table(schema = "project", name = "application_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "application_user_seq", allocationSize = 1)
public class User extends AbstractEntity{
    @Column
    private String name;

    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    @Column
    private UserType applicationUserType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", applicationUserType=" + applicationUserType +
                '}';
    }
}
