package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class NaleziTypuPredmetuEntityPK implements Serializable {
    @Column(name = "id_predmetu")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPredmetu;
    @Column(name = "id_typu")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypu;

    public int getIdPredmetu() {
        return idPredmetu;
    }

    public void setIdPredmetu(int idPredmetu) {
        this.idPredmetu = idPredmetu;
    }

    public int getIdTypu() {
        return idTypu;
    }

    public void setIdTypu(int idTypu) {
        this.idTypu = idTypu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NaleziTypuPredmetuEntityPK that = (NaleziTypuPredmetuEntityPK) o;

        if (idPredmetu != that.idPredmetu) return false;
        if (idTypu != that.idTypu) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPredmetu;
        result = 31 * result + idTypu;
        return result;
    }
}
