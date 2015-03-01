package com.group.Carnet_d_adresses.pages.entree;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Property;

import com.group.Carnet_d_adresses.entities.Entree;
import com.group.Carnet_d_adresses.entities.FormulaireEntree;
import com.group.Carnet_d_adresses.entities.InstanceCarnetDAdresses;

public class EditionEntree
{
	@Property
    @PageActivationContext
    private int identifiant;
	
	@Property
	private FormulaireEntree formulaireEntree=creationFormulaireEntree();
	
	@InjectPage
	private ListingEntree listingEntree;
	
	public Entree getEntree()
	{
		/** Recupere une entree a partir de son identifiant. */
		return InstanceCarnetDAdresses.getCarnetDAdresses().getEntreeByIdentifiant(identifiant);
	}
	
	public FormulaireEntree creationFormulaireEntree()
	{
		/** Creation d'un formulaire d'entree qui contient toutes les informations de l'entree selectionnee a partir de son identifiant. */
		FormulaireEntree formulaireEntree=new FormulaireEntree();
		formulaireEntree.nom=getEntree().getNom();
		formulaireEntree.prenom=getEntree().getPrenom();
		formulaireEntree.telephone=getEntree().getTelephone();
		formulaireEntree.rue=getEntree().getRue();
		formulaireEntree.codePostal=getEntree().getCodePostal();
		formulaireEntree.ville=getEntree().getVille();
		formulaireEntree.pays=getEntree().getPays();
		return formulaireEntree;
	}
	
	public Object onSuccess()
	{
		/** Modification de l'entree a partir des donnees du formulaire d'entree. */
		InstanceCarnetDAdresses.getCarnetDAdresses().editionEntree(
			getEntree(),
			formulaireEntree.nom,
			formulaireEntree.prenom,
			formulaireEntree.telephone,
			formulaireEntree.rue,
			formulaireEntree.codePostal,
			formulaireEntree.ville,
			formulaireEntree.pays);
		
		return listingEntree;
	}
}
