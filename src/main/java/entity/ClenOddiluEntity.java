package entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "clen_oddilu", schema = "public", catalog = "zakjachy")
public class ClenOddiluEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_clena")
    private int idClena;
    @Basic
    @Column(name = "login")
    private String login;
    @Basic
    @Column(name = "heslo")
    private String heslo;
    @Basic
    @Column(name = "jmeno")
    private String jmeno;
    @Basic
    @Column(name = "prijmeni")
    private String prijmeni;
    @Basic
    @Column(name = "prezdivka")
    private String prezdivka;
    @Basic
    @Column(name = "adresa")
    private String adresa;

    public int getIdClena() {
        return idClena;
    }

    public void setIdClena(int idClena) {
        this.idClena = idClena;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getPrezdivka() {
        return prezdivka;
    }

    public void setPrezdivka(String prezdivka) {
        this.prezdivka = prezdivka;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClenOddiluEntity that = (ClenOddiluEntity) o;

        if (idClena != that.idClena) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (heslo != null ? !heslo.equals(that.heslo) : that.heslo != null) return false;
        if (jmeno != null ? !jmeno.equals(that.jmeno) : that.jmeno != null) return false;
        if (prijmeni != null ? !prijmeni.equals(that.prijmeni) : that.prijmeni != null) return false;
        if (prezdivka != null ? !prezdivka.equals(that.prezdivka) : that.prezdivka != null) return false;
        if (adresa != null ? !adresa.equals(that.adresa) : that.adresa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClena;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (heslo != null ? heslo.hashCode() : 0);
        result = 31 * result + (jmeno != null ? jmeno.hashCode() : 0);
        result = 31 * result + (prijmeni != null ? prijmeni.hashCode() : 0);
        result = 31 * result + (prezdivka != null ? prezdivka.hashCode() : 0);
        result = 31 * result + (adresa != null ? adresa.hashCode() : 0);
        return result;
    }
}
