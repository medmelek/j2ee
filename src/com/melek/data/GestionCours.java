package com.melek.data;
import java.util.*;

import com.melek.beans.Etudiant;
import com.melek.beans.Study;

public class GestionCours {
	private List<Study> listStudy = new ArrayList<Study>();

	
	public GestionCours() {
		super();
		Study e1 = new Study();
		Study e2 = new Study();

		e1.setCode(1);
		e2.setCode(1);

		this.listStudy.add(e1);
		this.listStudy.add(e2);
	}

	
	public void ajouterCours(int code,String cours) {
		for (int i=0 ; i<listStudy.size();i++) {
			if(listStudy.get(i).getCode()==code) {
				listStudy.get(i).ajouterCours(cours);
				break ;
			}
		}
	}
	
	/*private void supprimerCours(int code,String cours) {
		for (int i=0 ; i<listStudy.size();i++) {
			if(listStudy.get(i).getCode()==code) {
				listStudy.get(i).ajouterCours(cours);
				break ;
			}
		}
	}*/
	
	
	public String listerCours(int code) {
		String cours=""  ;
		for (int i=0 ; i<listStudy.size();i++) {
			if(listStudy.get(i).getCode()==code) {
				for(int j=0;j<listStudy.get(i).getCours().size();j++) {
					cours=cours+" "+listStudy.get(i).getCours().get(j);
				}
			}
		}
		return cours ;
	}
}
