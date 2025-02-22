package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "umisteni_exemplare", schema = "public", catalog = "zakjachy")
public class UmisteniExemplareEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_umisteni")
    private int idPredmetu;
    @Basic
    @Column(name = "sklad")
    private String sklad;
    @Basic
    @Column(name = "cislo_police")
    private int cisloPolice;

    @OneToOne
    @JoinColumn(name = "id_predmetu", referencedColumnName = "id_predmetu")
    private PredmetEntity umistenyPredmet;

    public int getIdPredmetu() {
        return idPredmetu;
    }

    public void setIdPredmetu(int idPredmetu) {
        this.idPredmetu = idPredmetu;
    }

    public String getSklad() {
        return sklad;
    }

    public void setSklad(String sklad) {
        this.sklad = sklad;
    }

    public int getCisloPolice() {
        return cisloPolice;
    }

    public void setCisloPolice(int cisloPolice) {
        this.cisloPolice = cisloPolice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmisteniExemplareEntity that = (UmisteniExemplareEntity) o;

        if (idPredmetu != that.idPredmetu) return false;
        if (cisloPolice != that.cisloPolice) return false;
        if (sklad != null ? !sklad.equals(that.sklad) : that.sklad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPredmetu;
        result = 31 * result + (sklad != null ? sklad.hashCode() : 0);
        result = 31 * result + cisloPolice;
        return result;
    }
}
