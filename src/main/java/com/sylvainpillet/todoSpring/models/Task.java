package com.sylvainpillet.todoSpring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "Task")
public class Task extends Auditable<String> {
    @Getter
    @Id
    //Should use UUID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Getter
    @Setter
    @Column(name = "task_description")
    private String taskDescription;

    @Getter
    @Setter
//    @Column( name = "achiever" )
    @ManyToOne(optional = true, targetEntity = User.class)
    private User achiever;
}
