package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double prixUnitaire;
    private double tauxTva;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification;
    @OneToMany(mappedBy = "article")
    private Collection<CommandeClient> listeCommandeClients;
    @OneToMany(mappedBy = "article")
    private Collection<ArticleCategorie> listArticleCategories;
    @OneToMany(mappedBy = "article")
    private Collection<ArticleVente> listeArticleVentes;
    @OneToMany (mappedBy = "article")
    private Collection<Image> listeImages;
    @OneToMany(mappedBy = "article")
    private Collection<LivraisonFournisseur> listeLivraisonFournisseurs;
    @OneToMany(mappedBy = "article")
    private Collection<MouvementStock> listeMouvementStocks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(double tauxTva) {
        this.tauxTva = tauxTva;
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

    public Collection<CommandeClient> getListeCommandeClients() {
        return listeCommandeClients;
    }

    public void setListeCommandeClients(Collection<CommandeClient> listeCommandeClients) {
        this.listeCommandeClients = listeCommandeClients;
    }

    public Collection<ArticleCategorie> getListArticleCategories() {
        return listArticleCategories;
    }

    public void setListArticleCategories(Collection<ArticleCategorie> listArticleCategories) {
        this.listArticleCategories = listArticleCategories;
    }

    public Collection<ArticleVente> getListeArticleVentes() {
        return listeArticleVentes;
    }

    public void setListeArticleVentes(Collection<ArticleVente> listeArticleVentes) {
        this.listeArticleVentes = listeArticleVentes;
    }

    public Collection<Image> getListeImages() {
        return listeImages;
    }

    public void setListeImages(Collection<Image> listeImages) {
        this.listeImages = listeImages;
    }

    public Collection<LivraisonFournisseur> getListeLivraisonFournisseurs() {
        return listeLivraisonFournisseurs;
    }

    public void setListeLivraisonFournisseurs(Collection<LivraisonFournisseur> listeLivraisonFournisseurs) {
        this.listeLivraisonFournisseurs = listeLivraisonFournisseurs;
    }

    public Collection<MouvementStock> getListeMouvementStocks() {
        return listeMouvementStocks;
    }

    public void setListeMouvementStocks(Collection<MouvementStock> listeMouvementStocks) {
        this.listeMouvementStocks = listeMouvementStocks;
    }
}
