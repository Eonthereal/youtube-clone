package com.exercise.eon.youtubeclone.repository;

import com.exercise.eon.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
