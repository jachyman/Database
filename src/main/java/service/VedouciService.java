package service;

import dao.VedouciDAO;
import entity.VedouciEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class VedouciService implements VedouciDAO {
    @Override
    public void save(EntityManager em, VedouciEntity vedouci) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(vedouci);
        et.commit();
    }
}
