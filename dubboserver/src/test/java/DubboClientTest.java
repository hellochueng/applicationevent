import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzz.common.service.DubboService;
import org.lzz.dubboserver.DubboServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboServer.class)
@EnableAutoConfiguration
public class DubboClientTest {

    @Reference(version = "1.0.0")
    DubboService dubboService;

    @Test
    public void test1(){
        dubboService.sayHello();
    }
}
