package test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzz.event.Application;
import org.lzz.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableAutoConfiguration
public class EventTest {

    @Autowired
    EventService eventService;

    @Test
    public void test1(){
        eventService.eventService();
    }
}
