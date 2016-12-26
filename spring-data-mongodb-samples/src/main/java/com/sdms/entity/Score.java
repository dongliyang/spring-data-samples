package com.sdms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by William on 2016/12/19.
 */
@Data
@Document
public class Score {

    @Id
    String id;
    Double points;

    String studentId;
    String courseId;
    String teacherId;

    public static Score of(double points, String studentId, String courseId, String teacherId) {
        Score score = new Score();
        score.setPoints(points);
        score.setStudentId(studentId);
        score.setCourseId(courseId);
        score.setTeacherId(teacherId);
        return score;
    }
}
