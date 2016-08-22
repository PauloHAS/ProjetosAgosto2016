package lab3;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ValidadoresBean implements Serializable{

	private static final long serialVersionUID = 1704387722746166177L;
	
	private String atributoObrigatorio;
	private String email;
	private String celsiusToFahreinheit;
	public String getAtributoObrigatorio() {
		return atributoObrigatorio;
	}
	public void setAtributoObrigatorio(String atributoObrigatorio) {
		this.atributoObrigatorio = atributoObrigatorio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelsiusToFahreinheit() {
		return celsiusToFahreinheit;
	}
	public void setCelsiusToFahreinheit(String celsiusToFahreinheit) {
		this.celsiusToFahreinheit = celsiusToFahreinheit;
	}
	
	

}
