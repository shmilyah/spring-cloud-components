package com.geny.stream.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author shmilyahu
 * @date 2018/7/2 23:54
 */
@Component
@EnableBinding({Sink.class})
public class StreamReceiver {

    private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object message) {
        logger.info("StreamReceiver: {}", message);
    }
}
