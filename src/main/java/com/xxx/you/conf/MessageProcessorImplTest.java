package com.xxx.you.conf;

import com.alibaba.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Component;

/**
 * Created by youxiaojia on 2017/9/6.
 */
@Component
public class MessageProcessorImplTest implements MessageProcessor {
    public boolean handleMessage(MessageExt messageExt) {
        System.out.println("receive : " + messageExt.toString());
        return true;
    }
}