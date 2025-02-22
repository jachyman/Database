package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nalezi_typu_predmetu", schema = "public", catalog = "zakjachy")
@IdClass(NaleziTypuPredmetuEntityPK.class)
public class NaleziTypuPredmetuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_predmetu")
    private int idPredmetu;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_typu")
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

        NaleziTypuPredmetuEntity that = (NaleziTypuPredmetuEntity) o;

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
