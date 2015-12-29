package cz.zjor.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-context-*.xml"})
public class ModelServiceTest {

    @Inject
    private ModelService service;

    @Test
    public void test() {

        service.create("Model#001");
        log.info("{}", service.fetch());

    }
}
