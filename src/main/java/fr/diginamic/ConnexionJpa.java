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

        entityManager.close();
        entityManagerFactory.close();
    }
}

