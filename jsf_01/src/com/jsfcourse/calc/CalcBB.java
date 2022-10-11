package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class CalcBB {
	private String k;
	private String m;
	private String p;
	private Double result;

	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	

	@Inject
	FacesContext ctx;

	// Go to "showresult" if ok
	public String calc() {
		if (this.k != null && this.m != null && this.p != null) 
			//Chciałam tu dodać, aby dane wprowadzane przez użytkownika były sprawdzane i aby nie były puste, ale niestety nie podziałało. Mimo Wszystko zostawiłam to na następny tydzień, aby pózniej dalej spróbować z moim pomysłem. 
		{
		
		double k = Double.parseDouble(this.k);
		double m = Double.parseDouble(this.m);
		double p = Double.parseDouble(this.p);

		result = (k * p * (m+1))/2400;
		result = (k*p*(m+1))/2400.0;
		return "showresult";
		}
		else
			return null;
	}
}
