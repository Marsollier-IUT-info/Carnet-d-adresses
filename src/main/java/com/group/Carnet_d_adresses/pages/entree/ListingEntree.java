package com.group.Carnet_d_adresses.pages.entree;

import java.util.ArrayList;

import org.apache.tapestry5.annotations.Property;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class ListingEntree
{
	@Property
	private Entree entree;
	
	public ArrayList<Entree>getEntrees()
	{		
		/** - getEntrees() -> On recupere les entrees
		 *  - getCarnetDAdresses() -> a partir du carnet d'adresses
		 *  - InstanceCarnetDAdresses -> stocke dans la classe "InstanceCarnetDAdresses". */
		return InstanceCarnetDAdresses.getCarnetDAdresses().getEntrees();
	}
	
	public void onActionFromSuppression(int entreeIdentifiant)
    {
		/** - InstanceCarnetDAdresses.getCarnetDAdresses() : carnet d'adresses utilise par tout le programme.
		 *  - getEntreeByIdentifiant(int identifiant) */
        InstanceCarnetDAdresses.getCarnetDAdresses().suppressionEntree(
        		InstanceCarnetDAdresses.getCarnetDAdresses().getEntreeByIdentifiant(entreeIdentifiant));
    }
}
