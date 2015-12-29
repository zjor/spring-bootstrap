package cz.zjor.service;

import cz.zjor.model.Model;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Service
public class ModelService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Model create(String name) {
        return em.merge(new Model(name));
    }

    public List<Model> fetch() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Model> q = cb.createQuery(Model.class);
        return em.createQuery(q.select(q.from(Model.class))).getResultList();
    }
}
