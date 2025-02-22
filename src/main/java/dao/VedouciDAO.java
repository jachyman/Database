package dao;

import entity.VedouciEntity;
import jakarta.persistence.EntityManager;

public interface VedouciDAO {
    public void save (EntityManager em, VedouciEntity vedouci);
}
