package com.exercise.eon.youtubeclone.service;

import com.exercise.eon.youtubeclone.model.Video;
import com.exercise.eon.youtubeclone.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;

    public void uploadVideo(MultipartFile multipartFile){
       String videoUrl = s3Service.uploadFile(multipartFile);
       var video = new Video();
       video.setVideoUrl(videoUrl);

       videoRepository.save(video);
    }
}
