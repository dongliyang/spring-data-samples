package com.sdms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by William on 2016/12/19.
 */
@Data
@Document
public class Teacher {

    @Id
    String id;
    String name;

    public static Teacher of(String name){
        Teacher teacher = new Teacher();
        teacher.setName(name);
        return teacher;
    }
}
