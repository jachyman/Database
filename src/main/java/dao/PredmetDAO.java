package dao;

import entity.PredmetEntity;
import entity.UmisteniExemplareEntity;
import entity.VedouciEntity;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface PredmetDAO {
    public void save(EntityManager em, PredmetEntity predmet);
    public void delete(EntityManager em, PredmetEntity predmet);
    public VedouciEntity getSpravce(EntityManager em, PredmetEntity predmet);
    public UmisteniExemplareEntity getUmisteni(EntityManager em, PredmetEntity predmet);
    public List<PredmetEntity> findAllWithGreaterCost(EntityManager em, int minCost);
    public void createExemplar(EntityManager em, PredmetEntity predmet);
}
