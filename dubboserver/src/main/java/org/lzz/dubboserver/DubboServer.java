package org.lzz.dubboserver;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboServer {
    public static void main(String[] args) {
        SpringApplication.run(DubboServer.class, args);
    }
}
