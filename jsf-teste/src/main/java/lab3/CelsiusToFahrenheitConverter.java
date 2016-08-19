package lab3;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("celsiusTofahrenheitConverter")
public class CelsiusToFahrenheitConverter implements Converter {
	//,@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		float result = 0F;
		try {
			float celsius = Float.parseFloat(value);
			result = (celsius * 9/5) + 32;
		} catch (Exception e) {
			FacesMessage msg= new FacesMessage("Erro na conversão de celsius para fahreinheit","Entrada Invalida, Tente Novamente");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			
			throw new ConverterException(msg);
		}
		return result;
	}
	//@Override
	public String getAsString (FacesContext context, UIComponent component, String value){
		return value.toString();
	}
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return null;
	}
}
