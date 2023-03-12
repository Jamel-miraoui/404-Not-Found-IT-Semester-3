package com.example.demo;
import javax.servlet.ServletContextListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp3Application {
	
	@Bean
	public ServletRegistrationBean<Myservlet> ServletRegistrationBean(){
		ServletRegistrationBean<Myservlet> bean = new ServletRegistrationBean<Myservlet>(
				new Myservlet(), "/myServlet");
		return bean;
	}
	@Bean
	public FilterRegistrationBean<Myfilter> FilterRegistrationBean() {
		FilterRegistrationBean<Myfilter> bean = new FilterRegistrationBean<Myfilter>(new Myfilter());
		
		bean.addServletRegistrationBeans(new ServletRegistrationBean[] {
				ServletRegistrationBean()
		});
		return bean;
	}
	
	public ServletListenerRegistrationBean<ServletContextListener> listenerRegistrationBean(){
		ServletListenerRegistrationBean<ServletContextListener> bean = 
				new ServletListenerRegistrationBean<>();
		bean.setListener(new MyservletContextlistener());
		return bean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}

}
