package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "predmet", schema = "public", catalog = "zakjachy")
public class PredmetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_predmetu")
    private int idPredmetu;
    @Basic
    @Column(name = "nazev_predmetu")
    private String nazevPredmetu;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "cena")
    private Integer cena;

    @Basic
    @Column(name = "posledni_exemplar_id")
    private Integer posledniExemplarId = 0;
    @ManyToMany
    @JoinTable(
        name = "nalezi_typu_predmetu",
        joinColumns = @JoinColumn(name = "id_predmetu"),
        inverseJoinColumns = @JoinColumn(name = "id_typu")
    )
    Set<TypPredmetuEntity> typy_predmetu;

    @OneToOne(mappedBy = "umistenyPredmet")
    private UmisteniExemplareEntity umisteniExemplare;

    @ManyToOne
    @JoinColumn(name = "spravce_id", referencedColumnName = "id_clena")
    private ClenOddiluEntity spravce;

    public Integer getPosledniExemplarId() {
        return posledniExemplarId;
    }
    public void incresePosledniExemplarId() {
        this.posledniExemplarId++;
    }
    public Set<TypPredmetuEntity> getTypy_predmetu() {
        return typy_predmetu;
    }

    public UmisteniExemplareEntity getUmisteniExemplare() {
        return umisteniExemplare;
    }
    public ClenOddiluEntity getSpravce() {
        return spravce;
    }

    public void setSpravce(ClenOddiluEntity spravce) {
        this.spravce = spravce;
    }

    public void setTypy_predmetu(Set<TypPredmetuEntity> typy_predmetu) {
        this.typy_predmetu = typy_predmetu;
    }

    public void setUmisteniExemplare(UmisteniExemplareEntity umisteniExemplare) {
        this.umisteniExemplare = umisteniExemplare;
    }
    public int getIdPredmetu() {
        return idPredmetu;
    }

    public void setIdPredmetu(int idPredmetu) {
        this.idPredmetu = idPredmetu;
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    public void setNazevPredmetu(String nazevPredmetu) {
        this.nazevPredmetu = nazevPredmetu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredmetEntity that = (PredmetEntity) o;

        if (idPredmetu != that.idPredmetu) return false;
        if (nazevPredmetu != null ? !nazevPredmetu.equals(that.nazevPredmetu) : that.nazevPredmetu != null)
            return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (cena != null ? !cena.equals(that.cena) : that.cena != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPredmetu;
        result = 31 * result + (nazevPredmetu != null ? nazevPredmetu.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        return result;
    }
}
