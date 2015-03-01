package com.group.Carnet_d_adresses.pages.entree;

import java.util.ArrayList;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.grid.GridDataSource;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class ListingEntree
{
	@Property
	private Entree currentEntree;
	
	@InjectComponent
    private Zone result;
	
	@Property
    private GridDataSource source;
	
	public ArrayList<Entree>getEntrees()
	{		
		/** - getEntrees() -> On recupere les entrees
		 *  - getCarnetDAdresses() -> a partir du carnet d'adresses
		 *  - InstanceCarnetDAdresses -> stocke dans la classe "InstanceCarnetDAdresses". */
		return InstanceCarnetDAdresses.getCarnetDAdresses().getEntrees();
	}
	
	Object onAction()
    {
        return result.getBody();
    }
}
