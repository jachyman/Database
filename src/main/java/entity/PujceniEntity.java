package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "pujceni", schema = "public", catalog = "zakjachy")
public class PujceniEntity extends OperaceEntity{
    @Basic
    @Column(name = "cas_pujceni")
    private Timestamp casPujceni;
    @Basic
    @Column(name = "datum_na_vraceni")
    private Date datumNaVraceni;

    public Timestamp getCasPujceni() {
        return casPujceni;
    }

    public void setCasPujceni(Timestamp casPujceni) {
        this.casPujceni = casPujceni;
    }

    public Date getDatumNaVraceni() {
        return datumNaVraceni;
    }

    public void setDatumNaVraceni(Date datumNaVraceni) {
        this.datumNaVraceni = datumNaVraceni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PujceniEntity that = (PujceniEntity) o;

        if (casPujceni != null ? !casPujceni.equals(that.casPujceni) : that.casPujceni != null) return false;
        if (datumNaVraceni != null ? !datumNaVraceni.equals(that.datumNaVraceni) : that.datumNaVraceni != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (casPujceni != null ? casPujceni.hashCode() : 0);
        result = 31 * result + (datumNaVraceni != null ? datumNaVraceni.hashCode() : 0);
        return result;
    }
}
