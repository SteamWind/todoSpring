package com.sylvainpillet.todoSpring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@Entity
@Table( name = "Task" )
public class Task {
    @Getter
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;

    @Getter
    @NotNull
    @Column( name = "creation_date" )
    private Date creationDate = new Date();

    @Getter
    @Column( name = "task_description" )
    private String taskDescription;

    @Getter
    @Column( name = "achiever" )
    @ManyToOne( optional = true, targetEntity = User.class )
    private User achiever;
}
