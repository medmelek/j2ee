package com.melek.jee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.melek.data.GestionEtudiants;

@WebServlet("/Identification")
public class Identification extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private GestionEtudiants myLsitStudent = new GestionEtudiants(3);
       
    public Identification() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/identification.html").forward(request,response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email ;
		String password ;
		
		email= request.getParameter("email");
		password= request.getParameter("password");
		
		if((email.equals("admin@gmail.com"))&&(password.equals("admin"))) {
			request.setAttribute("list", this.myLsitStudent.getEtudiantList());
			this.getServletContext().getRequestDispatcher("/WEB-INF/StudentList.jsp").forward(request,response);
		}else {
			request.setAttribute("email", email);
			this.getServletContext().getRequestDispatcher("/WEB-INF/echec.jsp").forward(request,response);

		}

	}

}
