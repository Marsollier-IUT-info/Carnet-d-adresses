package com.group.Carnet_d_adresses.entities;

import java.util.ArrayList;

public class CarnetDAdresses
{
	private ArrayList<Entree>entrees;
	
	public CarnetDAdresses()
	{
		/** Constructeur sans parametre. */
		entrees=new ArrayList<Entree>();
	}
	
	public CarnetDAdresses(ArrayList<Entree>entrees)
	{
		/** Constructeur avec une liste d'entrees pre-configuree en parametre, pour creer un carnet d'adresses deja configure. */
		this.entrees=entrees;
	}
	
	public void listingEntrees()
	{
		/** Affiche la liste des entrees du carnet d'adresses. */
		String affichage="";
		for(Entree entree:entrees)
			affichage+=entree.getIdentifiant()+" "+entree.getNom()+" "+entree.getPrenom()+"\n";
		if(affichage=="")
			System.out.println("Aucune entree.\n");
		else
			System.out.println(affichage);
	}
	
	public void vueEntree(Entree entree)
	{
		/** Affiche le detail d'une entree. */
		System.out.println(entree);
	}
	
	public void ajoutEntree(Entree entree)
	{
		/** Ajoute une entree au carnet d'adresses. */
		entrees.add(entree);
	}
	
	public void editionEntree(Entree entree,String nom,String prenom,String telephone,String rue,String codePostal,String ville,String pays)
	{
		/** Permet de modifier une entree avec les nouveaux parametres definis. */
		entree.setNom(nom);
		entree.setPrenom(prenom);
		entree.setTelephone(telephone);
		entree.setRue(rue);
		entree.setCodePostal(codePostal);
		entree.setVille(ville);
		entree.setPays(pays);
	}
	
	public void suppressionEntree(Entree entree)
	{
		/** Supprime une entree du carnet d'adresses. */
		entrees.remove(entree);
	}
	
	/** Accesseurs. */
	public ArrayList<Entree>getEntrees(){return	entrees;}
	public void setEntrees(ArrayList<Entree>entrees){this.entrees=entrees;}
	
	public Entree getEntreeByIdentifiant(int identifiant)
	{
		/** Permet de retrouver une entree du carnet d'adresses par son identifiant unique 
		 * (renvoie "null" si aucune entree n'est associee a l'identifiant donne en parametre). */
		Entree entree=null;
		for(Entree entree0:entrees)
			if(identifiant==entree0.getIdentifiant())
				entree=entree0;
		return entree;
	}
}
