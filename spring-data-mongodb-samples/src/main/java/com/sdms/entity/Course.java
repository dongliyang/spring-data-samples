package com.sdms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by William on 2016/12/19.
 */
@Data
@Document
public class Course {

    @Id
    String id;
    String name;
    Integer credit;     // 学分

    String parentId;    // 先修课

    public static Course of(String name, int credit) {
        return of(name, credit, null);
    }

    public static Course of(String name, int credit, String parentId) {
        Course course = new Course();
        course.setName(name);
        course.setCredit(credit);
        course.setParentId(parentId);
        return course;
    }
}
