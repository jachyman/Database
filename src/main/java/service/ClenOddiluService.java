package service;

import dao.ClenOddiluDAO;
import entity.ClenOddiluEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class ClenOddiluService implements ClenOddiluDAO {
    @Override
    public void save(EntityManager em, ClenOddiluEntity clenOddilu) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(clenOddilu);
        et.commit();
    }

    @Override
    public ClenOddiluEntity findById(EntityManager em, Long id) {
        return em.find(ClenOddiluEntity.class, id);
    }
    @Override
    public void delete(EntityManager em, ClenOddiluEntity clenOddílu) {
        em.remove(clenOddílu);
    }

    @Override
    public List<String> getEmailyNaSpravce(EntityManager em) {
        return em.createQuery("SELECT v.email FROM VedouciEntity v WHERE v.spravuje.size > 0", String.class).getResultList();
    }

    @Override
    public List<ClenOddiluEntity> getAllClenOddilu(EntityManager em) {
        return em.createQuery("SELECT co FROM ClenOddiluEntity AS co", ClenOddiluEntity.class).getResultList();
    }
}
