package com.sdms.repository;

import com.sdms.entity.Score;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lzf on 16-12-24.
 */
@Repository
public interface ScoreMongoRepository extends MongoRepository<Score, String> {
}
