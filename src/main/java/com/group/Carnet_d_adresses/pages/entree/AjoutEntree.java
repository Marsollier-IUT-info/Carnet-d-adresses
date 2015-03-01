package com.group.Carnet_d_adresses.pages.entree;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.FormulaireEntree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;
import com.group.Carnet_d_adresses.pages.Index;

public class AjoutEntree
{
	@Property
	private FormulaireEntree formulaireEntree;
	
	@InjectPage
	private Index index;
	
	public Object onSuccess()
	{
		Entree entree=new Entree(formulaireEntree.nom,
			formulaireEntree.prenom,
			formulaireEntree.telephone,
			formulaireEntree.rue,
			formulaireEntree.codePostal,
			formulaireEntree.ville,
			formulaireEntree.pays);
		
		InstanceCarnetDAdresses.getCarnetDAdresses().ajoutEntree(entree);
		return index;
	}
}
