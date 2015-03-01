package com.group.Carnet_d_adresses.pages.entree;

import java.util.ArrayList;

import org.apache.tapestry5.annotations.Property;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class ListingEntree
{
	@Property
	/** - getEntrees() -> On recupere les entrees
	 *  - getCarnetDAdresses() -> a partir du carnet d'adresses
	 *  - InstanceCarnetDAdresses -> stocke dans la classe "InstanceCarnetDAdresses". */
	private ArrayList<Entree>entrees=InstanceCarnetDAdresses.getCarnetDAdresses().getEntrees();
}
