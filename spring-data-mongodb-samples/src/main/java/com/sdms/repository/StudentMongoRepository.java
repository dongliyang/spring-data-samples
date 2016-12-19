package com.sdms.repository;

import com.sdms.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by William on 2016/12/19.
 */
@Repository
public interface StudentMongoRepository extends MongoRepository<Student, String> {
}
