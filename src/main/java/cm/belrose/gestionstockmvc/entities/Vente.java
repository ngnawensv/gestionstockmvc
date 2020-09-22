package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Vente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "vente")
    private Collection<ArticleVente> listeArticleVentes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<ArticleVente> getListeArticleVentes() {
        return listeArticleVentes;
    }

    public void setListeArticleVentes(Collection<ArticleVente> listeArticleVentes) {
        this.listeArticleVentes = listeArticleVentes;
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

    @Override
    public String toString() {
        return "Vente{" +
                "id=" + id +
                ", listeArticleVentes=" + listeArticleVentes +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                '}';
    }
}
