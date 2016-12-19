package com.sdms.repository;

import com.sdms.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by William on 2016/12/19.
 */
@Repository
public interface StudentCrudRepository extends CrudRepository<Student, String> {
}
