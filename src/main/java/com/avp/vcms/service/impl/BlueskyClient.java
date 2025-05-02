package com.avp.vcms.service.impl;

import com.avp.vcms.dto.PostRequest;
import com.avp.vcms.service.SocialMediaClient;
import org.springframework.stereotype.Service;

// Bluesky implementation of SocialMediaClient
@Service("bluesky")
public class BlueskyClient implements SocialMediaClient {
    @Override
    public void post(PostRequest request) {
        System.out.println("Posting to Bluesky: " + request.getMessage());
    }
}
