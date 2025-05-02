package com.avp.vcms.controller;

import com.avp.vcms.dto.PostRequest;
import com.avp.vcms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

// main controller for Web posting
@Controller
@RequestMapping("/web")
public class WebPostController {
    @Autowired
    private PostService postService;
// to redirect to main page
    @GetMapping
    public String showForm() {
        return "postForm";
    }
// post mapping to get input from web form
    @PostMapping("/post")
    public String submitPost(@RequestParam String message,
                             @RequestParam(required = false) String mediaUrl,
                             @RequestParam List<String> platforms,
                             @RequestParam boolean immediate,
                             @RequestParam(required = false) String scheduleTime) {
        try {
            PostRequest request = new PostRequest();
            request.setMessage(message);
            request.setMediaUrl(mediaUrl);
            request.setPlatforms(platforms);
            request.setImmediate(immediate);

            if (!immediate && scheduleTime != null && !scheduleTime.isEmpty()) {
                request.setScheduledTime(LocalDateTime.parse(scheduleTime));
            }

            postService.handlePostRequest(request);
            return "redirect:/web/success";
        } catch (Exception e) {
            return "redirect:/web/error";
        }

    }
// for success mapping
    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";  // Loads success.html
    }
// for error mapping
    @GetMapping("/error")
    public String showErrorPage() {
        return "error";
    }
}
