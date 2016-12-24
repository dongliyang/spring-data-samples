package com.sdms;

import com.sdms.entity.Student;
import com.sdms.repository.StudentMongoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lzf on 16-12-24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTests {

    private Logger logger = LoggerFactory.getLogger(StudentTests.class);

    @Autowired
    StudentMongoRepository repository;

    @Test
    public void init() {
        repository.deleteAll();
        List<Student> students = Arrays.asList(
                Student.of("Rod", 53),
                Student.of("Josh", 36),
                Student.of("Webb", 42),
                Student.of("Dave", 61),
                Student.of("Winch", 32)
        );
        repository.insert(students);
        logger.info("insert: " + students);
    }

    @Test
    public void insert() {
        Student newGuy = new Student();
        newGuy.setAge((int) (Math.random() * 100));
        String[] names = {"ade", "etty", "ack", "om"};
        String[] letters = {"B", "C", "D", "J", "W", "T"};
        String name = letters[(int) (Math.random() * 10) % 6] + names[(int) (Math.random() * 10) % 4];
        newGuy.setName(name);
        repository.insert(newGuy);
        logger.info("insert: " + newGuy);
    }

    @Test
    public void update() {
        Student target = Student.of("Winch", null);
        target = repository.findOne(Example.of(target));
        logger.info("findOne: " + target);
        target.setAge((int) (Math.random() * 100));
        repository.save(target);
        logger.info("afterUpdate: " + target);
    }

    @Test
    public void findAll() {
        logger.info("page all : " + repository.findAll());
        Page<Student> students = repository.findAll(new PageRequest(0, 2));
        logger.info("page 1 2 : " + students.getContent());
    }
}
