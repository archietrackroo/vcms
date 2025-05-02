package com.avp.vcms.service.impl;

import com.avp.vcms.dto.PostRequest;
import com.avp.vcms.service.SocialMediaClient;
import org.springframework.stereotype.Service;

// Instagram implementation of SocialMediaClient
@Service("instagram")
public class InstagramClient implements SocialMediaClient {
    @Override
    public void post(PostRequest request) {
        System.out.println("Posting to Instagram: " + request.getMessage());
    }
}
