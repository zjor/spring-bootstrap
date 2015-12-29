package cz.zjor.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-context-*.xml"})
public class GreetServiceTest {

    @Inject
    private GreetService service;

    @Test
    public void test() {
        Assert.assertEquals("hello world", service.greet("world"));
    }
}
