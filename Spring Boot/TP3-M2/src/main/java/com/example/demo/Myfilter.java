package com.example.demo.filter;
import java.io.I0Exception;
import java.util.Enumeration;
import javax. .servlet.Filter;
import javax. servlet.FilterChain;
import javax. servlet. FilterConfig;
import javax. servlet.ServletException;
import javax. .servlet.ServletRequest;
import javax. servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@MebFilter("/myServlet")

public class Myfilter implements Filter {
  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
      throws I0Exception, ServletException {

    System.out.println("MyFilter doFilter() is invoked.");
    Enumerationstring> params = req.getParameterNames();
    while (params.hasMoreElements()) {
      String param-params.nextElement();
      System.out.println("Parameter:"+param + "\tValue: " + req.getParameter(param));
    }
    chain.dofilter(req, res);
      }

  @Override
  public void init(FilterConfig config) throws ServletException {

  }
  @Override
  public void destroy() {

  }
}