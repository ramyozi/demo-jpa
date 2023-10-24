package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "COMPO")
public class Compo {
    @Id
    private int ID;

    @ManyToOne
    @JoinColumn(name = "ID_LIV")
    private Livre livre; // Relation avec la table LIVRE

    @ManyToOne
    @JoinColumn(name = "ID_EMP")
    private Emprunt emprunt; // Relation avec EMPRUNT

	/** Constructeur
	 * 
	 */
	public Compo() {
	}

	/** Constructeur
	 * @param iD
	 * @param livre
	 * @param emprunt
	 */
	public Compo(int iD, Livre livre, Emprunt emprunt) {
		super();
		ID = iD;
		this.livre = livre;
		this.emprunt = emprunt;
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
	 * @return the livre
	 */
	public Livre getLivre() {
		return livre;
	}

	/** Setter
	 * @param livre the livre to set
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	/** Getter
	 * @return the emprunt
	 */
	public Emprunt getEmprunt() {
		return emprunt;
	}

	/** Setter
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(Emprunt emprunt) {
		this.emprunt = emprunt;
	}

	@Override
	public String toString() {
		return "Compo [ID=" + ID + ", livre=" + livre + ", emprunt="
				+ emprunt + "]";
	}

    
    
}
