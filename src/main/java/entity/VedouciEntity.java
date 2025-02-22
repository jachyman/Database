package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "vedouci", schema = "public", catalog = "zakjachy")
public class VedouciEntity extends ClenOddiluEntity {
    @Basic
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "spravce")
    private Set<PredmetEntity> spravuje;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VedouciEntity that = (VedouciEntity) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
