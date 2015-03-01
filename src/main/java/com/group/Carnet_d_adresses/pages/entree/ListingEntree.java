package com.group.Carnet_d_adresses.pages.entree;

import java.util.ArrayList;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class ListingEntree
{
	public ArrayList<Entree>getEntrees()
	{		
		/** - getEntrees() -> On recupere les entrees
		 *  - getCarnetDAdresses() -> a partir du carnet d'adresses
		 *  - InstanceCarnetDAdresses -> stocke dans la classe "InstanceCarnetDAdresses". */
		return InstanceCarnetDAdresses.getCarnetDAdresses().getEntrees();
	}
}
