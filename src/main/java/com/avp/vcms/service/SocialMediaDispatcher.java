package com.avp.vcms.service;

import com.avp.vcms.dto.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaDispatcher {
    @Autowired
    private ApplicationContext context;

    // to dispatch the post now depending on client
    public void dispatchNow(String platform, PostRequest request) {
        SocialMediaClient client = (SocialMediaClient) context.getBean(platform);
        client.post(request);
    }
}
