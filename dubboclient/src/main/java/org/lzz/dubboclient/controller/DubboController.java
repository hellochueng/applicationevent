package org.lzz.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lzz.common.service.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    @Reference()
    DubboService dubboService;

    @GetMapping("dubbo")
    public String test1(){
        return dubboService.sayHello();
    }
}
