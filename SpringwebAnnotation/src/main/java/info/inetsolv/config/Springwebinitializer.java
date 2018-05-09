package info.inetsolv.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Springwebinitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext container =
				new AnnotationConfigWebApplicationContext();
		
		container.register(SpringwebAnnotationConfiguration.class);
		
		container.setServletContext(servletContext);

		Dynamic servlet = servletContext.addServlet("servlet",
				new DispatcherServlet(container));
		
		servlet.addMapping("/");
		
		servlet.setLoadOnStartup(1);

	}

}
