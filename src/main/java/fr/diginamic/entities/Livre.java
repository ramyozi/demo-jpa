package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {
	@Id
    private int ID;
    private String TITRE;
    private String AUTEUR;
	
    /** Constructeur
	 */
	public Livre() {
	}
    
    /** Constructeur
	 * @param iD
	 * @param tITRE
	 * @param aUTEUR
	 */
	public Livre(int i, String t, String a) {
		super();
		ID = i;
		TITRE = t;
		AUTEUR = a;
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
	 * @return the tITRE
	 */
	public String getTITRE() {
		return TITRE;
	}

	/** Setter
	 * @param tITRE the tITRE to set
	 */
	public void setTITRE(String tITRE) {
		TITRE = tITRE;
	}

	/** Getter
	 * @return the aUTEUR
	 */
	public String getAUTEUR() {
		return AUTEUR;
	}

	/** Setter
	 * @param aUTEUR the aUTEUR to set
	 */
	public void setAUTEUR(String aUTEUR) {
		AUTEUR = aUTEUR;
	}
	
	
	
}
