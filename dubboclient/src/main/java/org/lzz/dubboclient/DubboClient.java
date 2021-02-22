package org.lzz.dubboclient;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboClient {
    public static void main(String[] args) {
        SpringApplication.run(DubboClient.class, args);
    }
}
