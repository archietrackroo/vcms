package com.avp.vcms.service.impl;

import com.avp.vcms.dto.PostRequest;
import com.avp.vcms.service.SocialMediaClient;
import org.springframework.stereotype.Service;

// Twitter implementation of SocialMediaClient
@Service("twitter")
public class TwitterClient implements SocialMediaClient {
    @Override
    public void post(PostRequest request) {
        // Use Twitter API logic or Twitter4J here
        System.out.println("Posting to Twitter: " + request.getMessage());
    }
}
