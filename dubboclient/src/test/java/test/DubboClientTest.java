package test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzz.common.service.DubboService;
import org.lzz.dubboclient.DubboClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboClient.class)
@EnableAutoConfiguration
public class DubboClientTest {

    @Reference
    DubboService dubboService;

    @Test
    public void test1(){
        dubboService.sayHello();
    }
}
