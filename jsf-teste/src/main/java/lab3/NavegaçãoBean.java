package lab3;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class NavegaçãoBean implements Serializable {

	private static final long serialVersionUID = -4085796118678663233L;

	public String navegacaoDinamicaIndex() {
		return "index";
	}
	
	public String navegacaoDinamicaPagina1(){
		return "pagina1";
	}
	
	public String navegacaoDinamicaExplicaIndex(){
		return "navegacaoExplicaIndex";
	}
	
	public String navegacaoDinamicaExplicaPagina1(){
		return "navegacaoExplicaPagina1";
	}

}
