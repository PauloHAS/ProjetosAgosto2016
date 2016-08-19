package lab3;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConversoresBean implements Serializable {

	private static final long serialVersionUID = 3382941617340002801L;

	private Date dataNascimento;
	private Integer peso;
	private String celsiusToFahreinheit;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getCelsiusToFahreinheit() {
		return celsiusToFahreinheit;
	}

	public void setCelsiusToFahreinheit(String celsiusToFahreinheit) {
		this.celsiusToFahreinheit = celsiusToFahreinheit;
	}

}
