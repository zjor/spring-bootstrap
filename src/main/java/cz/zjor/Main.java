package cz.zjor;

import cz.zjor.model.BasePart;
import cz.zjor.model.Product;
import cz.zjor.service.PartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-app.xml", "classpath:spring-context-persistence.xml", "classpath:spring-context-ds-postgres.xml");
        PartService service = context.getBean(PartService.class);

        BasePart p1 = service.createBolt("bolt#1", "24.5");
        BasePart p2 = service.createGear("gear#1", "24.5");
        Product p = service.createProduct(p1);

        log.info("{}", service.find(Product.class, p.getId()).getPart());

    }

}
