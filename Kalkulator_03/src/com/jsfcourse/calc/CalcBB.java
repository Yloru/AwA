package com.jsfcourse.calc;

import javax.inject.Inject; //dwa zakomentowane 
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.SessionScoped;
//import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class CalcBB { 
	private Double k;
	private Double m;
	private Double p;
	private Double result;

	public Double getK() {
		return k;
	}
	public void setK(Double k) {
		this.k = k;
	}
	public Double getM() {
		return m;
	}
	public void setM(Double m) {
		this.m = m;
	}
	public Double getP() {
		return p;
	}
	public void setP(Double p) {
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
		
		

		result = (k * p * (m+1))/2400;
		result = (k*p*(m+1))/2400.0;
		return "showresult";
		}
		else
			return null;
	}
}
