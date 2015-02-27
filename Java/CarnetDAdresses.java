import java.util.ArrayList;

public class CarnetDAdresses
{
	ArrayList<Entree>entrees;
	
	public CarnetDAdresses()
	{
		/** Constructeur sans parametres. */
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
		// TODO
	}
	
	public void vueEntree(Entree entree)
	{
		/** Affiche le detail d'une entree du carnet d'adresses. */
		// TODO
	}
	
	public void ajoutEntree(Entree entree)
	{
		/** Ajoute une entree au carnet d'adresse. */
		entrees.add(entree);
	}
	
	public void editionEntree(Entree entree)
	{
		/** Permet de modifier une entree du carnet d'adresses. */
		// TODO
	}
	
	public void suppressionEntree(Entree entree)
	{
		/** Supprime une entree du carnet d'adresse. */
		entrees.remove(entree);
	}
}
