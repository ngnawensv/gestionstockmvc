package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private boolean active;
    private String photoProfil;
    @OneToMany(mappedBy = "user")
    private Collection<UsersRoles> listeUsersRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Collection<UsersRoles> getListeUsersRoles() {
        return listeUsersRoles;
    }

    public void setListeUsersRoles(Collection<UsersRoles> listeUsersRoles) {
        this.listeUsersRoles = listeUsersRoles;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }
}
