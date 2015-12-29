package cz.zjor.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GreetService {

    public String greet(String name) {
        log.info("greeting: {}", name);

        return "hello " + name;
    }

}
