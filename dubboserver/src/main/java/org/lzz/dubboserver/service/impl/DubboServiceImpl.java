package org.lzz.dubboserver.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lzz.common.service.DubboService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DubboService.class,retries = 0)
@Component
public class DubboServiceImpl implements DubboService {
    public String sayHello() {
        return "hello";
    }
}
