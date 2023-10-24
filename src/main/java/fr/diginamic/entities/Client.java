package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	private int ID;
	private String NOM;
	private String PRENOM;

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param iD
	 * @param nOM
	 * @param pRENOM
	 */
	public Client(int iD, String nOM, String pRENOM) {
		super();
		ID = iD;
		NOM = nOM;
		PRENOM = pRENOM;
	}

	/**
	 * Getter
	 * 
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Setter
	 * 
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * Getter
	 * 
	 * @return the nOM
	 */
	public String getNOM() {
		return NOM;
	}

	/**
	 * Setter
	 * 
	 * @param nOM the nOM to set
	 */
	public void setNOM(String nOM) {
		NOM = nOM;
	}

	/**
	 * Getter
	 * 
	 * @return the pRENOM
	 */
	public String getPRENOM() {
		return PRENOM;
	}

	/**
	 * Setter
	 * 
	 * @param pRENOM the pRENOM to set
	 */
	public void setPRENOM(String pRENOM) {
		PRENOM = pRENOM;
	}

}
