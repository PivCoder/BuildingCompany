package com.example.buildingcompany.model;

import com.example.buildingcompany.model.enums.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "application_user")
@Table(schema = "project", name = "application_user")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "application_user_seq", allocationSize = 1)
public class User extends AbstractEntity {
    @Column
    private String name;

    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    @Column
    private UserType applicationUserType;
}
