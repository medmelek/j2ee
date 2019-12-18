package com.melek.jee.servlet;

import java.io.IOException;
import com.melek.data.*;
import com.melek.beans.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private GestionEtudiants myLsitStudent = new GestionEtudiants();
    private Etudiant myEtudiant = new Etudiant();
   
    public InsertionEtudiant() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/StudentList.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.myEtudiant.setNom(request.getParameter("nom"));
		this.myEtudiant.setPrenom(request.getParameter("prenom"));
		this.myEtudiant.setId(Integer.parseInt(request.getParameter("num")));
		this.myEtudiant.setMoy(Double.parseDouble(request.getParameter("moy")));
		if(this.myLsitStudent.existNum(this.myEtudiant.getId())) {
			this.myLsitStudent.insertStudent(this.myEtudiant);
		}
		request.setAttribute("list", this.myLsitStudent.getEtudiantList());
		this.getServletContext().getRequestDispatcher("/WEB-INF/StudentList.jsp").forward(request,response);

	}

}
