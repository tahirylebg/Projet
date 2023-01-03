package Enumeration;
import java.util.Random;
import java.util.Scanner;


import Magasin.Mag;
import Prix.ChoixClient;
import Prix.Presentation;

import java.util.Arrays;





public class Main {


	public static void main(String[] args) {
		
		
		EnumVendeur x= EnumVendeur.Responsable;
		System.out.println(x.RC());
		
		
		EnumClient y = EnumClient.Client;
		System.out.println(y.Chx());
		
		EnumVendeur z= EnumVendeur.ResponsableBis;
		System.out.println(z.RC());
		
		EnumClient v= EnumClient.ClientBis;
		System.out.println(v.Chx());
		
		Presentation.listeAnimaux();
		
		
		Mag magasin=new Mag();
		
		magasin.addArticle();
		
		magasin.achatArticle();
		
		magasin.Impression();
		
		ChoixClient.ChoixAnimaux();
		
		
		
		
    	
	
		
	}
		
}



