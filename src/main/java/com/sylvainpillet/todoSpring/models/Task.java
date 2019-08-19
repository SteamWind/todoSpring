package com.sylvainpillet.todoSpring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

    /**
     * Description of the task, what you should do
     */
    @Getter
    @Setter
    @NotNull
    @Size(max = 250)
    @Column(name = "task_description")
    private String taskDescription;

    /**
     * Who did this task. If null, task incomplete,
     * if a user, task has been completed by this achiever
     */
    @Getter
    @Setter
    @ManyToOne(optional = true, targetEntity = User.class)
    @JoinColumn(name = "user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User achiever;
}
