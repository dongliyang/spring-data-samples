package com.sdms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by William on 2016/12/19.
 */
@Data
@Document
public class Student {

    @Id
    String id;
    String name;
    Integer age;

    public static Student of(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }
}
