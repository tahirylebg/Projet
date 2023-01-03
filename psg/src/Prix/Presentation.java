package Prix;

import java.util.ArrayList;
import java.util.List;

import SPA.Animaux;
import SPA.Cat;
import SPA.CochonInde;
import SPA.Ouaf;

public class Presentation {
	

	public static void listeAnimaux(){
		
		//Cette fonction nous sert a montrer les types d'animaux qui peuvent etre servis
		
		//Pour les chiens
		//race , prix , taille en cm , poids 
		Ouaf rott = new Ouaf("Rottweiller",1200,69,60);
		Ouaf berg = new Ouaf("Berger Allemand",1000,65,40);
		Ouaf pek = new Ouaf("Pekinois",900,25,6.4);
		Ouaf bull = new Ouaf("Bulldog Francais",1100,30,11);
		
		//Pour les chats
		//race , prix , taille en cm, poids
		Cat siam= new Cat("Siamois",1500,30,6);
		Cat pers= new Cat("Persan",500,30,4);
		Cat burm= new Cat("Burmilla",1200,35,6);
		Cat chr= new Cat("Chartreux",1400,30,7);
		
		//Pour les cochons d'indes/hamster
		//race , prix , taille en cm
		
		CochonInde she= new CochonInde("Shelty",170,15,0.65);
		CochonInde abys= new CochonInde("Abyssinien",40,3,0.95);
		CochonInde per= new CochonInde("Peruvien",40,3,1.2);
		CochonInde ted = new CochonInde("Teddy",30,20,1.2);
		
		
		//liste de chiens
		ArrayList<Ouaf> ListeDeChien = new ArrayList<Ouaf>();
		ListeDeChien.add(rott);
        ListeDeChien.add(berg);
        ListeDeChien.add(pek);
        ListeDeChien.add(bull);
        
        //liste de chat
        ArrayList<Cat> Chat = new ArrayList<Cat>();
        Chat.add(siam);
        Chat.add(pers);
        Chat.add(burm);
        Chat.add(chr);
        

        //liste de lapins 
        ArrayList<CochonInde> Hamster=new ArrayList<CochonInde>();
        Hamster.add(ted);
        Hamster.add(abys);
        Hamster.add(she);
        Hamster.add(per);
       
        
        //liste des animaux
        ArrayList<Animaux> Animal = new ArrayList<Animaux>();
        
        
        System.out.println("\nVendeur de Chiens : Les types de Hamster que nous presentons\n");
        for (Ouaf o: ListeDeChien) {
        	Animal.add(o);
        	System.out.println(o.getNom()+" : "+o.getSize()+"cm, "+o.getHeight()+"kg, "+o.getPrize()+"€ ");
        }
        
        System.out.println("\nVendeur de Chat : Les types de Chat que nous presentons\n");
        
        for (Cat c:Chat) {
        	Animal.add(c);
        	System.out.println(c.getNom()+" : "+c.getSize()+"cm, "+c.getHeight()+"kg, "+c.getPrize()+"€ ");
        }
        
       System.out.println("\nVendeur de Hamster : Les types de Hamster que nous presentons\n");
        
        for (CochonInde co:Hamster) {
        	Animal.add(co);
        	System.out.println(co.getNom()+" : "+co.getSize()+"cm, "+co.getHeight()+"kg, "+co.getPrize()+"€ ");
        }
        
        
        
	}
	

}
