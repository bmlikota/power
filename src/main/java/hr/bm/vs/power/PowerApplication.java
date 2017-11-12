package hr.bm.vs.power;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * Created by Alex on 28/02/2015.
 */

// @EnableAutoConfigurationos
//@ComponentScan({ "hr.bm.vs.power" })
@SpringBootApplication
public class PowerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PowerApplication.class, args);
	}
	
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.jsf", "*.xhtml");
		return servletRegistrationBean;
    }

}
