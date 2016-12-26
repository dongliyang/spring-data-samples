package com.sdms;

import com.sdms.entity.Course;
import com.sdms.entity.Teacher;
import com.sdms.repository.CourseMongoRepository;
import com.sdms.repository.ScoreMongoRepository;
import com.sdms.repository.StudentMongoRepository;
import com.sdms.repository.TeacherMongoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lzf on 16-12-26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreTests {
    private Logger logger = LoggerFactory.getLogger(ScoreTests.class);

    @Autowired
    StudentMongoRepository studentMongoRepository;

    @Autowired
    TeacherMongoRepository teacherMongoRepository;

    @Autowired
    CourseMongoRepository courseMongoRepository;

    @Autowired
    ScoreMongoRepository scoreMongoRepository;

    @Test
    public void contextLoad() {

        // init data-set
        initStudent();
        initTeacher();
        initCourse();
        initScore();

        // find something in some ways

    }

    private void initStudent() {
    }

    private void initTeacher() {
    }

    private void initCourse() {
    }

    private void initScore() {
    }


}
