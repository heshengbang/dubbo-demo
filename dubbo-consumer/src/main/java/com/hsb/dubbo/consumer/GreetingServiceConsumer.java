package com.hsb.dubbo.consumer;

import com.hsb.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author heshengbang
 * 2019/5/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Component("annotatedConsumer")
public class GreetingServiceConsumer {

    @Reference
    private HelloService greetingService;

    public String doSayHello() {
        return greetingService.sayHi();
    }

}