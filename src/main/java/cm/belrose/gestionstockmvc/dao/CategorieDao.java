package cm.belrose.gestionstockmvc.dao;

import cm.belrose.gestionstockmvc.entities.Article;
import cm.belrose.gestionstockmvc.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieDao extends JpaRepository<Categorie, Long> {
}
