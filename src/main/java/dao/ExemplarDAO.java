package dao;

import entity.ExemplarEntity;
import jakarta.persistence.EntityManager;

public interface ExemplarDAO {
    public void save(EntityManager em, ExemplarEntity exemplar);
}
