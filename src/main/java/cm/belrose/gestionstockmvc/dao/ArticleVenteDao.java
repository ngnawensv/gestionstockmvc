package cm.belrose.gestionstockmvc.dao;

import cm.belrose.gestionstockmvc.entities.Article;
import cm.belrose.gestionstockmvc.entities.ArticleVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleVenteDao extends JpaRepository<ArticleVente, Long> {
}
