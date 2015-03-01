package com.group.Carnet_d_adresses.entities;
import java.util.ArrayList;

public class CarnetDAdresses
{
	ArrayList<Entree1>entrees;
	
	public CarnetDAdresses()
	{
		/** Constructeur sans parametre. */
		entrees=new ArrayList<Entree1>();
	}
	
	public CarnetDAdresses(ArrayList<Entree1>entrees)
	{
		/** Constructeur avec une liste d'entrees pre-configuree en parametre, pour creer un carnet d'adresses deja configure. */
		this.entrees=entrees;
	}
	
	public void listingEntrees()
	{
		/** Affiche la liste des entrees du carnet d'adresses. */
		String affichage="";
		for(Entree1 entree:entrees)
			affichage+=entree.getIdentifiant()+" "+entree.getNom()+" "+entree.getPrenom()+"\n";
		if(affichage=="")
			System.out.println("Aucune entree.\n");
		else
			System.out.println(affichage);
	}
	
	public void vueEntree(Entree1 entree)
	{
		/** Affiche le detail d'une entree. */
		System.out.println(entree);
	}
	
	public void ajoutEntree(Entree1 entree)
	{
		/** Ajoute une entree au carnet d'adresses. */
		entrees.add(entree);
	}
	
	public void editionEntree(Entree1 entree,String nom,String prenom,String telephone,String rue,String codePostal,String ville,String pays)
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
	
	public void suppressionEntree(Entree1 entree)
	{
		/** Supprime une entree du carnet d'adresses. */
		entrees.remove(entree);
	}
	
	public Entree1 getEntreeByIdentifiant(int identifiant)
	{
		/** Permet de retrouver une entree du carnet d'adresses par son identifiant unique 
		 * (renvoie "null" si aucune entree n'est associee a l'identifiant donne en parametre). */
		Entree1 entree=null;
		for(Entree1 entree0:entrees)
			if(identifiant==entree0.getIdentifiant())
				entree=entree0;
		return entree;
	}
}
