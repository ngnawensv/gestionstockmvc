package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private String prenom;
    private String sexe;
    private Date dateNaissance;
    private String lieuNaissance;
    private String telephone1;
    private String telephone2;
    private String email;
    private String statut;
    private String residence;
    private String photo;
    @OneToMany(mappedBy = "personne")
    private Collection<CommandeClient> listeCommandeClients;
    @OneToMany(mappedBy = "personne")
    private Collection<LivraisonFournisseur> listeLivraisonFournisseurs;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
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

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Collection<CommandeClient> getListeCommandeClients() {
        return listeCommandeClients;
    }

    public void setListeCommandeClients(Collection<CommandeClient> listeCommandeClients) {
        this.listeCommandeClients = listeCommandeClients;
    }

    public Collection<LivraisonFournisseur> getListeLivraisonFournisseurs() {
        return listeLivraisonFournisseurs;
    }

    public void setListeLivraisonFournisseurs(Collection<LivraisonFournisseur> listeLivraisonFournisseurs) {
        this.listeLivraisonFournisseurs = listeLivraisonFournisseurs;
    }
}
