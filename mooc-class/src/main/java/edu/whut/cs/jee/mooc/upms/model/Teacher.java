package edu.whut.cs.jee.mooc.upms.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Teacher")
public class Teacher extends User {

    @Column(name = "title")
    private String title;

}