package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nom;
    private Date dateCreation;
    private Date dateModification;
    @OneToMany(mappedBy = "categorie")
    private Collection<ArticleCategorie> listeArticleCategories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Collection<ArticleCategorie> getListeArticleCategories() {
        return listeArticleCategories;
    }

    public void setListeArticleCategories(Collection<ArticleCategorie> listeArticleCategories) {
        this.listeArticleCategories = listeArticleCategories;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                ", listeArticleCategories=" + listeArticleCategories +
                '}';
    }
}
