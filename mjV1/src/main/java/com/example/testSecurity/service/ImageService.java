package com.example.testSecurity.service;

import com.example.testSecurity.dto.ImageInfo;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    List<ImageInfo> uploadImage(List<MultipartFile> imageList, Long profileNo);

    Resource load(String filename);
}
