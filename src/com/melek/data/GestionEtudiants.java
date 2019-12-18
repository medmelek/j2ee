package com.melek.data;
import java.util.ArrayList;
import java.util.List;

import com.melek.beans.Etudiant;
public class GestionEtudiants {
		
	private static List<Etudiant> etudiantList ;
	
	public GestionEtudiants(int taille) {
		
		if (this.etudiantList==null) {
			this.etudiantList = new ArrayList<Etudiant>();
		}		
		
		Etudiant etudiant1 = new Etudiant();
		Etudiant etudiant2 = new Etudiant();

		etudiant1.setNom("med melek");
		etudiant1.setPrenom("oueslati");
		etudiant1.setId(1);
		etudiant1.setMoy(13.85);
		
		etudiant2.setNom("patrick");
		etudiant2.setPrenom("burn");
		etudiant2.setId(2);
		etudiant2.setMoy(8.50);
		
		this.insertStudent(etudiant1);
		this.insertStudent(etudiant2);

		
	}
	
	public GestionEtudiants() {
		if (this.etudiantList==null) {
			this.etudiantList = new ArrayList<Etudiant>();
		}
	
	}

	public List<Etudiant> getEtudiantList() {
		return etudiantList;
	}

	
	public void insertStudent (Etudiant e) {
		if(!this.existNum(e.getId()))
		this.etudiantList.add(e);
	}
	
	
	public boolean existNum (int num) {
		for (int i=0; i<this.etudiantList.size(); i++) {
			if (this.etudiantList.get(i).getId()==num) {
				
			   return true ;
			}
			
		}
		return false ;
	}
	
	public void deleteStudent(int num) {
		
		for (int i=0; i<this.etudiantList.size(); i++) {
			if (this.etudiantList.get(i).getId()==num) {
			   etudiantList.remove(i);
			}
			
		}
		
	}
	
	
	public List<Etudiant>  searchStudent (int num) {
		List<Etudiant> myetudiantList = new ArrayList<Etudiant>();
		for (int i=0; i<etudiantList.size();i++) {
			if(etudiantList.get(i).getId()==num) {
				myetudiantList.add(etudiantList.get(i));
				break ;
			}
		}
		return myetudiantList ;
	}
	
	

	
	

}
