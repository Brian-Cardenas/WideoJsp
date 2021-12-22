package co.wideo.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import co.wideo.demo.dao.WideoDAO;
import co.wideo.demo.model.WideoVO;
import co.wideo.demo.service.WideoManager;

@WebServlet("/wideo-module/savedWideo")
public class WideoSaveServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	WideoDAO dao;

	@Autowired
	WideoManager manager;
	
	private WebApplicationContext springContext;

	@Override
	public void init(final ServletConfig config) throws ServletException {
		super.init(config);
		springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		final AutowireCapableBeanFactory beanFactory = springContext.getAutowireCapableBeanFactory();
		beanFactory.autowireBean(this);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<WideoVO> listWideo = dao.getInstance();
		String nameWideo = req.getParameter("namewideo");
		String jsonWideo = req.getParameter("jsonwideo");

		WideoVO wideo = new WideoVO();
		wideo.setJson(jsonWideo);
		wideo.setName(nameWideo);
		wideo.setId(listWideo.size()+1);
		
		listWideo.add(wideo);
		System.out.println("Agregado");
		
	}


}
