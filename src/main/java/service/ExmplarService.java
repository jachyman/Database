package service;

import dao.ExemplarDAO;
import entity.ExemplarEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ExmplarService implements ExemplarDAO{

    @Override
    public void save(EntityManager em, ExemplarEntity exemplar) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(exemplar);
        et.commit();
    }
}
