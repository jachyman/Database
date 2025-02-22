package service;

import dao.ExemplarDAO;
import dao.PredmetDAO;
import entity.ExemplarEntity;
import entity.PredmetEntity;
import entity.UmisteniExemplareEntity;
import entity.VedouciEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class PredmetService implements PredmetDAO {
    @Override
    public void save(EntityManager em, PredmetEntity predmet) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(predmet);
        et.commit();
    }
    @Override
    public void delete(EntityManager em, PredmetEntity predmet) {
        em.detach(predmet);
    }

    @Override
    public VedouciEntity getSpravce(EntityManager em, PredmetEntity predmet) {
        return em.find(VedouciEntity.class, predmet.getSpravce());
    }

    @Override
    public UmisteniExemplareEntity getUmisteni(EntityManager em, PredmetEntity predmet) {
        return em.find(UmisteniExemplareEntity.class, predmet.getUmisteniExemplare());
    }

    @Override
    public List<PredmetEntity> findAllWithGreaterCost(EntityManager em, int minCost) {
        return em.createQuery("SELECT p FROM PredmetEntity p WHERE p.cena > :minCost", PredmetEntity.class).setParameter("minCost", minCost).getResultList();
    }

    @Override
    public void createExemplar(EntityManager em, PredmetEntity predmet) {
        ExemplarEntity exemplar = new ExemplarEntity();
        exemplar.setPredmet(predmet);
        exemplar.setCisloExemplare(predmet.getPosledniExemplarId());
        predmet.incresePosledniExemplarId();
        ExemplarDAO exemplarDAO = new ExmplarService();
        exemplarDAO.save(em, exemplar);
    }
}
