package Magasin;

import java.util.Scanner;

public class Mag {

	private double sorties,entrées;
	private ArticleAnimaux[] articles = new ArticleAnimaux[100];
	static Scanner input=new Scanner(System.in);
	
	public ArticleAnimaux arriveeAnimaux() {
		
		String NomAnimal=null;
		int prixAchat=0;
		
		while ((NomAnimal==null)||(prixAchat==0)) {
			System.out.print("Responsable a la caisse :Qu'avez vous choisi ?" );
			NomAnimal=input.nextLine();
			System.out.print("Le prix d'achat" );
			prixAchat=input.nextInt();
			System.out.println();
			
			
		}
		
		return new ArticleAnimaux(NomAnimal,prixAchat);
		
	}
	
	public void addArticle() {
		for (int x=0;x<articles.length;x++) {
			if (articles[x]==null) {
				articles[x]=arriveeAnimaux();
				x=articles.length;
				
			}
		}
	}
	
	public void Impression() {
		for (int x=0;x<articles.length;x++) {
			if (articles[x]!=null) {
				System.out.println(" Numero : "+(x+1)+" Nom : "+articles[x].getNomAnimaux()+" Prix : "+articles[x].getPrixAchat());
			}
		}
	}
	
	public void achatArticle() {
		int numeroArticle=-1;
		int quantité=0;
		
		while (numeroArticle<0||articles[numeroArticle]==null) {
			System.out.print("Numero article acheté :");
			numeroArticle=input.nextInt()-1;
			input.nextLine();
			
		}
		
		System.out.println();
		
		while (quantité<1) {
			System.out.print(" Nombre article acheté :");
			quantité=input.nextInt();
			input.nextLine();
			
		}
		
		articles[numeroArticle].setNomAnimaux(articles[numeroArticle].getNomAnimaux()+quantité);
		entrées+=articles[numeroArticle].getPrixAchat()*quantité;
		}
		
	
		
		
		
		
		
	}
	

