package com.melek.jee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.melek.data.GestionEtudiants;


@WebServlet("/SearchEtudiant")
public class SearchEtudiant extends HttpServlet {
	
	private GestionEtudiants myLsitStudent = new GestionEtudiants();

	private static final long serialVersionUID = 1L;

    public SearchEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			request.setAttribute("list", this.myLsitStudent.searchStudent(Integer.parseInt(request.getParameter("search"))));
			this.getServletContext().getRequestDispatcher("/WEB-INF/StudentList.jsp").forward(request,response);
			
		}catch (Exception e) {
			request.setAttribute("list", this.myLsitStudent.getEtudiantList());
			this.getServletContext().getRequestDispatcher("/WEB-INF/StudentList.jsp").forward(request,response);
		
		}
			
		
	}

}
