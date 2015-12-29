package cz.zjor;

import cz.zjor.service.ModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-*.xml");
        ModelService service = context.getBean(ModelService.class);

        service.create("Model#001");
        log.info("{}", service.fetch());
    }

}
