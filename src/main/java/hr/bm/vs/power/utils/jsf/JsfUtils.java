package hr.bm.vs.power.utils.jsf;

import javax.el.ELContext;
import javax.faces.context.FacesContext;

public class JsfUtils {

	public static Object getBean(String beanName) {
		Object bean = null;
		FacesContext fc = FacesContext.getCurrentInstance();
		if (fc != null) {
			ELContext elContext = fc.getELContext();
			bean = elContext.getELResolver().getValue(elContext, null, beanName);
		}

		return bean;
	}

}
