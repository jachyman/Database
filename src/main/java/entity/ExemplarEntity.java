package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "exemplar", schema = "public", catalog = "zakjachy")
public class ExemplarEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_exemplare")
    private int idExemplare;

    @ManyToOne
    @JoinColumn(name = "id_predmetu", referencedColumnName = "id_predmetu")
    private PredmetEntity Predmet;
    @Basic
    @Column(name = "cislo_exemplare")
    private Integer cisloExemplare;

    @OneToMany(mappedBy = "exemplarOperace")
    private Set<OperaceEntity> operaceExmplare;

    public void setPredmet(PredmetEntity predmet) {
        Predmet = predmet;
    }
    public int getIdExemplare() {
        return idExemplare;
    }

    public void setIdExemplare(int idExemplare) {
        this.idExemplare = idExemplare;
    }
    public Integer getCisloExemplare() {
        return cisloExemplare;
    }

    public void setCisloExemplare(Integer cisloExemplare) {
        this.cisloExemplare = cisloExemplare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExemplarEntity that = (ExemplarEntity) o;

        if (idExemplare != that.idExemplare) return false;
        if (Predmet != that.Predmet) return false;
        if (cisloExemplare != null ? !cisloExemplare.equals(that.cisloExemplare) : that.cisloExemplare != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = idExemplare;
        result = 31 * result + Predmet.getIdPredmetu();
        result = 31 * result + (cisloExemplare != null ? cisloExemplare.hashCode() : 0);
        return result;
    }
}
