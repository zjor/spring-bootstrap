package cz.zjor.service;

import cz.zjor.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-context-*.xml"})
public class ModelServiceTest {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private ModelService service;

    @Test
    public void test() {

        service.create("Model#001");
        log.info("{}", service.fetch());

    }

    @Transactional
    public void createModel() {
        em.merge(new Model("Model#002"));
    }

    @Test
    @Transactional
    public void shouldFetch() {
        createModel();

        log.info("{}", service.fetch());

    }
}
