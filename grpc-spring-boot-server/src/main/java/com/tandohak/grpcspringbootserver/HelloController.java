package com.tandohak.grpcspringbootserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(MultipartFile multipartFile) {
        fileService.upload(multipartFile);
        return ResponseEntity.ok("IT'S OK");
    }
}
