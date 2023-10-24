package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Region;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Connexion à la base de données réussie.");

        
        Region region1 = entityManager.find(Region.class, 1); 
        System.out.println("Région extraite : " + region1.getNOM());
        
        Region nouvelleRegion = new Region();
        nouvelleRegion.setID(3);
        nouvelleRegion.setNOM("Ile de France");
        entityManager.getTransaction().begin();
        entityManager.persist(nouvelleRegion);
        entityManager.getTransaction().commit();
        
        Region region3 = entityManager.find(Region.class, 3);
        System.out.println("Nouvelle région extraite : " + region3.getNOM());
        
        entityManager.close();
        entityManagerFactory.close();
    }
}

