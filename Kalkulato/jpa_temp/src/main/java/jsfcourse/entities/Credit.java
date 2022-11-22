package jsfcourse.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the credits database table.
 * 
 */
@Entity
@Table(name="credits")
@NamedQuery(name="Credit.findAll", query="SELECT c FROM Credit c")
public class Credit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCredit;

	private int credit;

	private int interest;

	private int months;

	private float resultCredit;

	public Credit() {
	}

	public int getIdCredit() {
		return this.idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
	}

	public int getCredit() {
		return this.credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getInterest() {
		return this.interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public int getMonths() {
		return this.months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public float getResultCredit() {
		return this.resultCredit;
	}

	public void setResultCredit(float resultCredit) {
		this.resultCredit = resultCredit;
	}

}