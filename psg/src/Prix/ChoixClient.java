package Prix;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import SPA.Animaux;
import SPA.Cat;
import SPA.CochonInde;
import SPA.Ouaf;

public class ChoixClient {
    
    public static void ChoixAnimaux() {
    

    	//Pour voir les types d'animaux qui peuvent etre servis
	
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
	

    	//Pour les hamsters/cochon d'inde 
    	//race , prix , taille en cm , poids
    	
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
    	
    	
    	
    	try ( Scanner scanner = new Scanner( System.in ) ){
    		
    		ArrayList<Animaux> Animal = new ArrayList<Animaux>();
    	
    	System.out.print( "\n Client : J'aimerai bien un \n");
    	String login = scanner.nextLine();
    	
    	System.out.print( "\n Client : J'ai un budjet de \n");
    	int v = scanner.nextInt();
    	
    	
    	//Si le client  demande en plus un chat , alors on lui proposera un chat en rapport avec son budjet 
    	//Si le client demande en plus un chien , alors on lui proposera un chien en rapport avec son budjet
    	//Si le client demande en plus un hamster/cochon d'inde , alors on lui en proposera un en rapport avec son budjet 
    	//S'il demande un animal qui n'est pas dans vendable , alors on lui dira qu'il n'y a pas 
    	
    	if (login=="chat"){
    		
    		if (v<100){
    			System.out.println("Vous ne pouvez pas acheter de chat ");
    		}
    		
    		else if (v>1500){
    			for (Cat ch: Chat){
    				Animal.add(ch);
    				if (ch.getPrize()>1500) {
    					System.out.println("Vous pouvez acheter "+ch.getNom());
    				}
    			}
    		}
    		
    		else {
    			for (Cat ch: Chat){
    				Animal.add(ch);
    				if (ch.getPrize()>1500 && ch.getPrize()<100){
    					System.out.println("Vous pouvez acheter "+ch.getNom());
    				}
    			}
    		}
    	}
    	
    	
    	else if (login=="chien"){
    		if (v<100){
    			System.out.println("Vous ne pouvez pas acheter de chien ");
    		}
    		
    		else if (v>1500){
    			for (Ouaf o: ListeDeChien){
    				Animal.add(o);
    				if (o.getPrize()>1500) {
    					System.out.println("Vous pouvez acheter "+o.getNom());
    				}
    			}
    		}
    		
    		else {
    			for (Ouaf o: ListeDeChien){
    				Animal.add(o);
    				if (o.getPrize()>1300 && o.getPrize()<100){
    					System.out.println("Vous pouvez acheter "+o.getNom());
    				}
    			}

    		}
    	
    	}
    	
    	else if (login=="Hamster"){
    		
    		if (v<20){
    			System.out.println("Vous ne pouvez pas acheter de Hamster ");
    		}
    		
    		else if (v>1500){
    			for (CochonInde ci: Hamster){
    				Animal.add(ci);
    				if (ci.getPrize()>100) {
    					System.out.println("Vous pouvez acheter "+ci.getNom());
    				}
    			}
    		}
    		
    		else {
    			for (CochonInde ci: Hamster){
    				Animal.add(ci);
    				if (ci.getPrize()>30 && ci.getPrize()<100){
    					System.out.println("Vous pouvez acheter "+ci.getNom());
    				}
    			}

    		}
    		
    	}
    	else {
    		System.out.println("Il n'y pas cet animal");
    	}
    	
    	
    	}
		
            
    	
    	
    	
    }
    
    }

    	
    	
 
    

