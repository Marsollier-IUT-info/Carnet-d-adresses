package com.group.Carnet_d_adresses.pages.entree;

import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Property;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class VueEntree
{
	@Property
    @PageActivationContext
    private int identifiant;
	
	public Entree getEntree()
	{
		return InstanceCarnetDAdresses.getCarnetDAdresses().getEntreeByIdentifiant(identifiant);
	}
}
