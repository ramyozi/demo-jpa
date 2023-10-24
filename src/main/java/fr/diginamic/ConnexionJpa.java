package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Client;
import fr.diginamic.entities.Emprunt;
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

		// récupérer tous les clients
		List<Client> clients = entityManager
				.createQuery("SELECT c FROM Client c", Client.class)
				.getResultList();
		System.out.println("Liste des clients :");
		for (Client c : clients) {
			System.out.println(c.getNOM() + " " + c.getPRENOM());
		}
		System.out.println(
				"======================================================");
		int clientId = 1;

		// Requête JPA pour extraire les emprunts du client
		List<Emprunt> emprunts = entityManager.createQuery(
				"SELECT e FROM Emprunt e WHERE e.client.ID = :clientId",
				Emprunt.class).setParameter("clientId", clientId)
				.getResultList();

		if (emprunts.isEmpty()) {
			System.out.println(
					"Aucun emprunt trouvé pour le client avec l'ID "
							+ clientId);
		} else {
			System.out.println(
					"Emprunts du client avec l'ID " + clientId + ":");
			for (Emprunt emprunt : emprunts) {
				System.out.println("ID Emprunt: " + emprunt.getID()
						+ ", Date de début: " + emprunt.getDATE_DEBUT()
						+ ", Date de fin: " + emprunt.getDATE_FIN());
			}
		}
		System.out.println(
				"======================================================");
		

		entityManager.close();
		entityManagerFactory.close();
	}
}
