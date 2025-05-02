package com.avp.vcms.service;

import com.avp.vcms.dto.PostRequest;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.concurrent.ScheduledFuture;

@Service
public class SchedulerService {
    private final TaskScheduler scheduler = new ThreadPoolTaskScheduler();

    private final SocialMediaDispatcher dispatcher;

    public SchedulerService(SocialMediaDispatcher dispatcher) {
        ((ThreadPoolTaskScheduler) scheduler).initialize();
        this.dispatcher = dispatcher;
    }

    // schedule post as per date time selected
    public ScheduledFuture<?> schedule(String platform, PostRequest request) {
        return scheduler.schedule(() ->
                        dispatcher.dispatchNow(platform, request),
                request.getScheduledTime().atZone(ZoneId.systemDefault()).toInstant()
        );
    }
}
