package com.avp.vcms.service;

import com.avp.vcms.dto.PostRequest;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final SocialMediaDispatcher dispatcher;
    private final SchedulerService scheduler;

    public PostService(SocialMediaDispatcher dispatcher, SchedulerService scheduler) {
        this.dispatcher = dispatcher;
        this.scheduler = scheduler;
    }

    // to handle the Post request whether to post now or schedule
    public void handlePostRequest(PostRequest request) {
        for (String platform : request.getPlatforms()) {
            if (request.isImmediate()) {
                dispatcher.dispatchNow(platform, request);
            } else {
                scheduler.schedule(platform, request);
            }
        }
    }
}
