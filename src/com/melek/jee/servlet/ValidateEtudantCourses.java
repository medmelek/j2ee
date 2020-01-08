package com.melek.jee.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.melek.data.GestionCours;
import com.melek.data.GestionEtudiants;

@WebServlet("/ValidateEtudantCourses")
public class ValidateEtudantCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ValidateEtudantCourses() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GestionEtudiants gestionEtudiants = new GestionEtudiants();
		GestionCours gestionCours = new GestionCours();
		
		
		String code= request.getParameter("code");
		
		String cours ;
		
		String android = request.getParameter("android");
		String angular = request.getParameter("angular");
		String django = request.getParameter("django");
		String dotnetcore = request.getParameter("dotnetcore");
		
		if(android!=null) {
			gestionCours.ajouterCours(Integer.parseInt(code), "android");
		}
		
		if(angular!=null) {
			gestionCours.ajouterCours(Integer.parseInt(code), "angular");
		}
		
		if(django!=null) {
			gestionCours.ajouterCours(Integer.parseInt(code), "django");
		}
		
		if(dotnetcore!=null) {
			gestionCours.ajouterCours(Integer.parseInt(code), "dotnetcore");
		}
		
		cours = gestionCours.listerCours(Integer.parseInt(code));
		
		request.setAttribute("list", gestionEtudiants.searchStudent(Integer.parseInt(code)));
		request.setAttribute("code",code);
		request.setAttribute("cours",cours);

		this.getServletContext().getRequestDispatcher("/WEB-INF/courses.jsp").forward(request,response);


		ServletContext context = getServletContext( );
		//context.log(code+"--"+cours);


		
	}

}
