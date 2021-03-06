package cm.belrose.gestionstockmvc.dao;

import cm.belrose.gestionstockmvc.entities.Article;
import cm.belrose.gestionstockmvc.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RolesDao extends JpaRepository<Roles, Long> {
}
