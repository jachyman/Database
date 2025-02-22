package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "typ_predmetu", schema = "public", catalog = "zakjachy")
public class TypPredmetuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_typu")
    private int idTypu;
    @Basic
    @Column(name = "nazev_typu")
    private String nazevTypu;
    @Basic
    @Column(name = "nazev_nadtypu_predmetu")
    private String nazevNadtypuPredmetu;
    @ManyToMany(mappedBy = "typy_predmetu")
    Set<PredmetEntity> predmety_typu;

    public int getIdTypu() {
        return idTypu;
    }

    public void setIdTypu(int idTypu) {
        this.idTypu = idTypu;
    }

    public String getNazevTypu() {
        return nazevTypu;
    }

    public void setNazevTypu(String nazevTypu) {
        this.nazevTypu = nazevTypu;
    }

    public String getNazevNadtypuPredmetu() {
        return nazevNadtypuPredmetu;
    }

    public void setNazevNadtypuPredmetu(String nazevNadtypuPredmetu) {
        this.nazevNadtypuPredmetu = nazevNadtypuPredmetu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypPredmetuEntity that = (TypPredmetuEntity) o;

        if (idTypu != that.idTypu) return false;
        if (nazevTypu != null ? !nazevTypu.equals(that.nazevTypu) : that.nazevTypu != null) return false;
        if (nazevNadtypuPredmetu != null ? !nazevNadtypuPredmetu.equals(that.nazevNadtypuPredmetu) : that.nazevNadtypuPredmetu != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypu;
        result = 31 * result + (nazevTypu != null ? nazevTypu.hashCode() : 0);
        result = 31 * result + (nazevNadtypuPredmetu != null ? nazevNadtypuPredmetu.hashCode() : 0);
        return result;
    }
}
