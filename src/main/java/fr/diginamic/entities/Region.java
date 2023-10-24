package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGION")
public class Region {
    @Id
    private int ID;
    private String NOM;
    
    /** Constructeur
	 */
	public Region() {
	}
	
	/** Constructeur
	 * @param iD
	 * @param nOM
	 */
	public Region(int iD, String nOM) {
		super();
		ID = iD;
		NOM = nOM;
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
	 * @return the nOM
	 */
	public String getNOM() {
		return NOM;
	}

	/** Setter
	 * @param nOM the nOM to set
	 */
	public void setNOM(String nOM) {
		NOM = nOM;
	}
	
	

    
}
