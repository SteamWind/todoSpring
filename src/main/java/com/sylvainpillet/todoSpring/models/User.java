package com.sylvainpillet.todoSpring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table( name = "User" )
public class User {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Integer id;

    /**
     * The full name of the user
     */
    @Getter
    @Column( name = "name" )
    private String name;
}
