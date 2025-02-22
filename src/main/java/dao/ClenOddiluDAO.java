package dao;

import entity.ClenOddiluEntity;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface ClenOddiluDAO {
    public void save(EntityManager em, ClenOddiluEntity clenOddilu);
    public ClenOddiluEntity findById(EntityManager em, Long id);
    public void delete(EntityManager em, ClenOddiluEntity clenOddílu);
    public List<String> getEmailyNaSpravce(EntityManager em);
    public List<ClenOddiluEntity> getAllClenOddilu(EntityManager em);
}
