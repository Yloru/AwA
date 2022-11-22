package com.jsfcourse.calc;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
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

	public String calc() {
		try {
			
//			double k = Double.parseDouble(this.k);
//			double m = Double.parseDouble(this.m);
//			double p = Double.parseDouble(this.p);
			
		result = (k * p * (m+1))/2400;
		result = (k*p*(m+1))/2400.0;
		
		ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacja wykonana poprawnie", null));
		return "showresult"; 
		}
		
		catch (Exception e) {
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Błąd podczas przetwarzania parametrów", null));
			return null; 
		}
		
	}
}
