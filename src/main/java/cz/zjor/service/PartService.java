package cz.zjor.service;

import cz.zjor.model.BasePart;
import cz.zjor.model.BoltPart;
import cz.zjor.model.GearPart;
import cz.zjor.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Slf4j
@Service
public class PartService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public GearPart createGear(String name, String innerRadius) {
        return em.merge(new GearPart(name, innerRadius));
    }

    @Transactional
    public BoltPart createBolt(String name, String outerRadius) {
        return em.merge(new BoltPart(name, outerRadius));
    }

    @Transactional
    public Product createProduct(BasePart part) {
        return em.merge(new Product(part));
    }

    public BasePart find(String id) {
        return em.find(BasePart.class, id);
    }

    @Transactional
    public <T> T find(Class<T> clazz, String id) {
        T entity = em.find(clazz, id);
        log.info("{}", entity);
        return entity;
    }

}
