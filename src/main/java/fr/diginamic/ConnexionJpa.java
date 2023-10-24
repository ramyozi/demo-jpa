package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Livre;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("biblio_jpa");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		System.out.println("Connexion à la base de données réussie.");

		int livreId = 1;
		Livre livre = entityManager.find(Livre.class, livreId);

		if (livre != null) {
			System.out.println(livre.toString());
		} else {
			System.out.println("Livre non trouvé avec l'ID: " + livreId);
		}

		entityManager.close();
		entityManagerFactory.close();
	}
}
