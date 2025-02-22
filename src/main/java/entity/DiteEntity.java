package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dite", schema = "public", catalog = "zakjachy")
public class DiteEntity extends ClenOddiluEntity {
    @Basic
    @Column(name = "tel_cislo_na_rodice")
    private int telCisloNaRodice;

    public int getTelCisloNaRodice() {
        return telCisloNaRodice;
    }

    public void setTelCisloNaRodice(int telCisloNaRodice) {
        this.telCisloNaRodice = telCisloNaRodice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiteEntity that = (DiteEntity) o;

        if (telCisloNaRodice != that.telCisloNaRodice) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * telCisloNaRodice;
        return result;
    }
}
