package com.group.Carnet_d_adresses.entities;

public class Entree
{
	// Nombre entier qui va identifier de maniere unique chaque entree
	// (initialise a 0, nombre qui sera l'identifiant de la premiere entree).
	// Ce nombre est ensuite incremente a chaque creation d'entree.
	private static int dernierIdentifiant=0;
	
	// Identifiant unique de l'entree, obetenu a partir du dernier identifiant.
	private int identifiant=0;
	
	private String nom;
	private String prenom;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String pays;
	
	public Entree()
	{
		/** Constructeur sans parametre. */
		
		// Nouvel identifiant (unique).
		identifiant=dernierIdentifiant;
		
		// Incrementation pour le prochain identifiant.
		dernierIdentifiant++;
	}
	
	public Entree(String nom,String prenom,String telephone,String rue,String codePostal,String ville,String pays)
	{
		/** Constructeur avec tous les parametres d'une entree. */
		
		// Nouvel identifiant (unique).
		identifiant=dernierIdentifiant;
		
		// Incrementation pour le prochain identifiant.
		dernierIdentifiant++;
		
		this.nom=nom;
		this.prenom=prenom;
		this.telephone=telephone;
		this.rue=rue;
		this.codePostal=codePostal;
		this.ville=ville;
		this.pays=pays;
	}
	
	/** Accesseurs */
	public int getIdentifiant(){return identifiant;}
	public String getNom(){return nom;}
	public String getPrenom(){return prenom;}
	public String getTelephone(){return telephone;}
	public String getRue(){return rue;}
	public String getCodePostal(){return codePostal;}
	public String getVille(){return ville;}
	public String getPays(){return pays;}
	
	/** Modificateurs */
	public void setNom(String nom){this.nom=nom;}
	public void setPrenom(String prenom){this.prenom=prenom;}
	public void setTelephone(String telephone){this.telephone=telephone;}
	public void setRue(String rue){this.rue=rue;}
	public void setCodePostal(String codePostal){this.codePostal=codePostal;}
	public void setVille(String ville){this.ville=ville;}
	public void setPays(String pays){this.pays=pays;}
	
	/** Affichage */
	public String toString()
	{
		String affichage="Entree numero : "+identifiant
			+"\nNom : "+nom
			+"\nPrenom : "+prenom
			+"\nTelephone : "+telephone
			+"\nRue : "+rue
			+"\nCode postal : "+codePostal
			+"\nVille : "+ville
			+"\nPays : "+pays+"\n";
		return affichage;
	}
}
