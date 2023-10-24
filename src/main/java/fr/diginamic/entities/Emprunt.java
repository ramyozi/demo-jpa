package fr.diginamic.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
    @Id
    private int ID;
    private Date DATE_DEBUT;
    private Date DATE_FIN;
    private int DELAI;
    
    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client; // Relation avec la table CLIENT


	/** Constructeur
	 */
	public Emprunt() {

	}
	
	/** Constructeur
	 * @param iD
	 * @param dATE_DEBUT
	 * @param dATE_FIN
	 * @param dELAI
	 * @param client
	 */
	public Emprunt(int iD, Date dATE_DEBUT, Date dATE_FIN, int dELAI,
			Client client) {
		super();
		ID = iD;
		DATE_DEBUT = dATE_DEBUT;
		DATE_FIN = dATE_FIN;
		DELAI = dELAI;
		this.client = client;
	}

	/** Getter
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/** Setter
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/** Getter
	 * @return the dATE_DEBUT
	 */
	public Date getDATE_DEBUT() {
		return DATE_DEBUT;
	}

	/** Setter
	 * @param dATE_DEBUT the dATE_DEBUT to set
	 */
	public void setDATE_DEBUT(Date dATE_DEBUT) {
		DATE_DEBUT = dATE_DEBUT;
	}

	/** Getter
	 * @return the dATE_FIN
	 */
	public Date getDATE_FIN() {
		return DATE_FIN;
	}

	/** Setter
	 * @param dATE_FIN the dATE_FIN to set
	 */
	public void setDATE_FIN(Date dATE_FIN) {
		DATE_FIN = dATE_FIN;
	}

	/** Getter
	 * @return the dELAI
	 */
	public int getDELAI() {
		return DELAI;
	}

	/** Setter
	 * @param dELAI the dELAI to set
	 */
	public void setDELAI(int dELAI) {
		DELAI = dELAI;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Emprunt [ID=" + ID + ", DATE_DEBUT=" + DATE_DEBUT
				+ ", DATE_FIN=" + DATE_FIN + ", DELAI=" + DELAI
				+ ", client=" + client + "]";
	}
	
	

}
