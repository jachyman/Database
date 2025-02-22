package dao;

import entity.VraceniEntity;

import java.sql.Timestamp;

public interface VraceniDAO {
    public void save(VraceniEntity vraceni);
    public void delete(VraceniEntity vraceni);
    public Timestamp getTime();
}
