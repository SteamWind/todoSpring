package com.sylvainpillet.todoSpring.models;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

    @Getter
    @Column(name = "creation_date")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date creationDate = new Date();

    @Getter
    @Column(name = "update_date")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updateDate = new Date();


}
