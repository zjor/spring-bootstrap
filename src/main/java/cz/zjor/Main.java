package cz.zjor;

import cz.zjor.service.GreetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-*.xml");
        GreetService service = context.getBean(GreetService.class);

        log.info(service.greet("world"));
    }

}
