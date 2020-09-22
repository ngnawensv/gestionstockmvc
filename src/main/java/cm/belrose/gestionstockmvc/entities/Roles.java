package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String roleName;
    @OneToMany(mappedBy = "role")
    private Collection<UsersRoles> listeUsersRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Collection<UsersRoles> getListeUsersRoles() {
        return listeUsersRoles;
    }

    public void setListeUsersRoles(Collection<UsersRoles> listeUsersRoles) {
        this.listeUsersRoles = listeUsersRoles;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", listeUsersRoles=" + listeUsersRoles +
                '}';
    }
}
