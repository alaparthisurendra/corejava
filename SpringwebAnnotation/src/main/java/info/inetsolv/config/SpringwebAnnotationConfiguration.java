package info.inetsolv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="info.inetsolv")
@EnableWebMvc
public class SpringwebAnnotationConfiguration {
	
@Bean
public ViewResolver viewResolver()
{
	InternalResourceViewResolver viewResolver = 
			new InternalResourceViewResolver();
	
	viewResolver.setPrefix("/pages/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	
}

}
