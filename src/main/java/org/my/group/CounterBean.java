package org.my.group;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.scheduler.Scheduled;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class CounterBean {

    @Scheduled(every="1s")
    void log() {
        log.info("Hello from logback");
    }

}
