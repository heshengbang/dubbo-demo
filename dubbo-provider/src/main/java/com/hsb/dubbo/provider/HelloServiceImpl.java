package com.hsb.dubbo.provider;

import com.hsb.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author heshengbang
 * 2019/5/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi() {
        return "hello!";
    }
}
