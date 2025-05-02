package com.avp.vcms.controller;

import com.avp.vcms.dto.PostRequest;
import com.avp.vcms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// for checking only backend. does same work as WebPost controller
@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<String> schedulePost(@RequestBody PostRequest request) {
        postService.handlePostRequest(request);
        return ResponseEntity.ok("Post scheduled/sent successfully");
    }
}
