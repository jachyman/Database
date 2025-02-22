package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "operace", schema = "public", catalog = "zakjachy")
public class OperaceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_operace")
    private int idOperace;
    @Basic
    @Column(name = "cas_operace")
    private Timestamp casOperace;
    @Basic
    @Column(name = "id_predmetu")
    private int idPredmetu;
    @ManyToOne
    @JoinColumn(name = "id_exemplare", referencedColumnName = "id_exemplare")
    private ExemplarEntity exemplarOperace;

    public int getIdOperace() {
        return idOperace;
    }

    public void setIdOperace(int idOperace) {
        this.idOperace = idOperace;
    }

    public Timestamp getCasOperace() {
        return casOperace;
    }

    public void setCasOperace(Timestamp casOperace) {
        this.casOperace = casOperace;
    }

    public int getIdPredmetu() {
        return idPredmetu;
    }

    public void setIdPredmetu(int idPredmetu) {
        this.idPredmetu = idPredmetu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperaceEntity that = (OperaceEntity) o;

        if (idOperace != that.idOperace) return false;
        if (idPredmetu != that.idPredmetu) return false;
        if (casOperace != null ? !casOperace.equals(that.casOperace) : that.casOperace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOperace;
        result = 31 * result + (casOperace != null ? casOperace.hashCode() : 0);
        result = 31 * result + idPredmetu;
        return result;
    }
}
