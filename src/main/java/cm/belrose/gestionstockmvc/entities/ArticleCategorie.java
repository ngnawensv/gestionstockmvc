package cm.belrose.gestionstockmvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ArticleCategorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Article article;
    @ManyToOne
    private  Categorie categorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "ArticleCategorie{" +
                "id=" + id +
                ", article=" + article +
                ", categorie=" + categorie +
                '}';
    }
}
