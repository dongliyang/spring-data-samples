package com.sdms;

import com.sdms.entity.Student;
import com.sdms.repository.StudentCrudRepository;
import com.sdms.repository.StudentMongoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataMongodbSamplesApplicationTests {

    @Autowired
    StudentMongoRepository studentMongoRepository;

    @Autowired
    StudentCrudRepository studentCrudRepository;

    private Logger logger = LoggerFactory.getLogger(SpringDataMongodbSamplesApplicationTests.class);

    @Test
    public void contextLoads() {
        studentCrudRepository.deleteAll();
        Student student = new Student();
        student.setAge((int) (Math.random() * 100));
        student.setName("A" + (int) (Math.random() * 10000));
        studentMongoRepository.insert(student);
        List<Student> students = studentMongoRepository.findAll(Example.of(student));
        students.forEach(a -> logger.info(a.toString()));
    }

}
