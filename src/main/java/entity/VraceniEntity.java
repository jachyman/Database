package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "vraceni", schema = "public", catalog = "zakjachy")
public class VraceniEntity extends OperaceEntity {
    @Basic
    @Column(name = "cas_vraceni")
    private Timestamp casVraceni;
    @Basic
    @Column(name = "poplatek_za_poskozeni")
    private int poplatekZaPoskozeni;

    public Timestamp getCasVraceni() {
        return casVraceni;
    }

    public void setCasVraceni(Timestamp casVraceni) {
        this.casVraceni = casVraceni;
    }

    public int getPoplatekZaPoskozeni() {
        return poplatekZaPoskozeni;
    }

    public void setPoplatekZaPoskozeni(int poplatekZaPoskozeni) {
        this.poplatekZaPoskozeni = poplatekZaPoskozeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VraceniEntity that = (VraceniEntity) o;

        if (poplatekZaPoskozeni != that.poplatekZaPoskozeni) return false;
        if (casVraceni != null ? !casVraceni.equals(that.casVraceni) : that.casVraceni != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getIdOperace();
        result = 31 * result + (casVraceni != null ? casVraceni.hashCode() : 0);
        result = 31 * result + poplatekZaPoskozeni;
        return result;
    }
}
