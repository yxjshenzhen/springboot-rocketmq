package com.xxx.you.conf;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * Created by youxiaojia on 2017/9/6.
 */
public interface MessageProcessor {
    /**
     * 处理消息的接口
     * @param messageExt
     * @return
     */
    public boolean handleMessage(MessageExt messageExt);
}