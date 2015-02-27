import java.util.Scanner;

public class Main
{
	@SuppressWarnings("all")
	public static void main(String[]args)
	{
		// Le carnet d'adresses est automatiquement cree.
		CarnetDAdresses carnetDAdresses=new CarnetDAdresses();
		
		// Creation d'une entree (input) via invite de commande.
		Scanner scanner=new Scanner(System.in);
		
		boolean enSelection=true;		
		
		while(enSelection)
		{
			System.out.println("Entrer le numero correspondant a l'instruction voulue :\n"
				+"1 : Listing des entrees.\n"
				+"2 : Vue d'une entree.\n"
				+"3 : Ajout d'une entree.\n"
				+"4 : Edition d'une entree.\n"
				+"5 : Suppression d'une entree.\n"
				+"0 : Quitter.");
			
			int selection=scanner.nextInt();
			scanner.nextLine();
			
			switch(selection)
			{
				case 0:
					System.out.println("Arret du programme.");
					enSelection=false;
					break;
				case 1:
					carnetDAdresses.listingEntrees();
					break;
				case 2:
					System.out.println("Entrer l'identifiant de l'entree a consulter :");
					int identifiant=scanner.nextInt();
					scanner.nextLine();
					Entree entree=carnetDAdresses.getEntreeByIdentifiant(identifiant);
					if(entree==null)
						System.out.println("Aucune entree n'est associee a cet identifiant.");
					else
						carnetDAdresses.vueEntree(entree);
					break;
				case 3:
					System.out.println("Nom :");
					String nom=scanner.nextLine();
					System.out.println("Prenom :");
					String prenom=scanner.nextLine();
					System.out.println("Telephone :");
					String telephone=scanner.nextLine();
					System.out.println("Rue :");
					String rue=scanner.nextLine();
					System.out.println("Code postal :");
					String codePostal=scanner.nextLine();
					System.out.println("Ville :");
					String ville=scanner.nextLine();
					System.out.println("Pays :");
					String pays=scanner.nextLine();
					Entree entree0=new Entree(nom,prenom,telephone,rue,codePostal,ville,pays);
					carnetDAdresses.ajoutEntree(entree0);
					break;
				case 4:
					System.out.println("Entrer l'identifiant de l'entree a editer :");
					int identifiant0=scanner.nextInt();
					scanner.nextLine();
					Entree entree1=carnetDAdresses.getEntreeByIdentifiant(identifiant0);
					if(entree1==null)
						System.out.println("Aucune entree n'est associee a cet identifiant.");
					else
					{
						System.out.println("Nom :");
						String nom0=scanner.nextLine();
						System.out.println("Prenom :");
						String prenom0=scanner.nextLine();
						System.out.println("Telephone :");
						String telephone0=scanner.nextLine();
						System.out.println("Rue :");
						String rue0=scanner.nextLine();
						System.out.println("Code postal :");
						String codePostal0=scanner.nextLine();
						System.out.println("Ville :");
						String ville0=scanner.nextLine();
						System.out.println("Pays :");
						String pays0=scanner.nextLine();
						carnetDAdresses.editionEntree(entree1, nom0, prenom0, telephone0, rue0, codePostal0, ville0, pays0);
					}
					break;
				case 5:
					System.out.println("Entrer l'identifiant de l'entree a supprimer :");
					int identifiant1=scanner.nextInt();
					scanner.nextLine();
					Entree entree2=carnetDAdresses.getEntreeByIdentifiant(identifiant1);
					if(entree2==null)
						System.out.println("Aucune entree n'est associee a cet identifiant.");
					else
						carnetDAdresses.suppressionEntree(entree2);
					break;
				default:
					System.out.println("Instruction invalide.");
					break;
			}
			
			System.out.println("Appuyer sur \"Entree\" pour continuer.");
			scanner.nextLine(); // Attend que l'utilisateur appuie sur "Entree" (apres qu'il ait pu lire le message).
		}
	}
}
