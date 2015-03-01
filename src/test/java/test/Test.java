package test;
import com.group.Carnet_d_adresses.entities.*;

public class Test
{
	public static void main(String[]args)
	{
		String nom="Marsollier";
		String prenom="Thomas";
		String telephone="0605472023";
		String rue="5 rue du Maine";
		String codePostal="37330";
		String ville="Channay-sur-Lathan";
		String pays="France";
		
		// Creation d'un carnet d'adresse.
		CarnetDAdresses carnetDAdresses=new CarnetDAdresses();
		
		// Creation d'entrees.
		Entree entree0=new Entree(nom,prenom,telephone,rue,codePostal,ville,pays);
		Entree entree1=new Entree(nom,prenom,telephone,rue,codePostal,ville,pays);
		Entree entree2=new Entree(nom,prenom,telephone,rue,codePostal,ville,pays);
		
		// Ajout des entrees au carnet d'adresses.
		carnetDAdresses.ajoutEntree(entree0);
		carnetDAdresses.ajoutEntree(entree1);
		carnetDAdresses.ajoutEntree(entree2);
		
		// Edition d'une entree.
		carnetDAdresses.editionEntree(entree2,"Marsollier0",prenom,telephone,rue,codePostal,ville,pays);
		
		// Suppresson d'une entree du carnet d'adresse.		
		carnetDAdresses.suppressionEntree(entree1);
		
		// Listing des entrees du carnet d'adresse.
		carnetDAdresses.listingEntrees();
		
		// Vue d'une entree.
		carnetDAdresses.vueEntree(entree0);		
	}
}
