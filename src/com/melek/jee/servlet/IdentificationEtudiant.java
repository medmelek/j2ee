package com.melek.jee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.melek.beans.Etudiant;
import com.melek.data.GestionEtudiants;


@WebServlet("/IdentificationEtudiant")
public class IdentificationEtudiant extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    
    public IdentificationEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/identificationEtudiant.jsp").forward(request,response);	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GestionEtudiants gestionEtudiants = new GestionEtudiants(2);

		String password ;
		
		password= request.getParameter("password");
		
		try {
			
			Etudiant e = gestionEtudiants.searchStudent(Integer.parseInt(password)).get(0);
			
			if (e!=null) {
				request.setAttribute("list", gestionEtudiants.searchStudent(Integer.parseInt(password)));
				request.setAttribute("code",password);
				this.getServletContext().getRequestDispatcher("/WEB-INF/courses.jsp").forward(request,response);
			}else {
				request.setAttribute("code",password);
				this.getServletContext().getRequestDispatcher("/WEB-INF/echecEtudiant.jsp").forward(request,response);

			}
			
		}catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("code",password);
			this.getServletContext().getRequestDispatcher("/WEB-INF/echecEtudiant.jsp").forward(request,response);
		}
		
		
	}

}
