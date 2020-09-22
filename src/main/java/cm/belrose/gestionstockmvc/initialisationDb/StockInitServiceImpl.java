package cm.belrose.gestionstockmvc.initialisationDb;

import cm.belrose.gestionstockmvc.dao.CategorieDao;
import cm.belrose.gestionstockmvc.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.stream.Stream;

@Service
@Transactional
public class StockInitServiceImpl implements StockInitService {
    @Autowired
    CategorieDao categorieDao;
    @Override
    public void initCategorie() {
        Stream.of("Categorie 1","Categorie 2","Categorie 3","Categorie 4","Categorie 5").forEach(nomCategorie->{
            Categorie categorie=new Categorie();
            categorie.setNom("Nom"+nomCategorie);
            categorie.setCode("Code"+nomCategorie);
            categorie.setDateCreation(new Date());
            categorieDao.save(categorie);
        });

    }

    @Override
    public void initMouvementStock() {

    }

    @Override
    public void initVente() {

    }

    @Override
    public void initImage() {

    }

    @Override
    public void initArticleVente() {

    }

    @Override
    public void initRoles() {

    }

    @Override
    public void initUsers() {

    }

    @Override
    public void initPersonne() {

    }

    @Override
    public void initCommandeClient() {

    }

    @Override
    public void initLivraisonFournisseur() {

    }

    @Override
    public void initArticle() {

    }
}
