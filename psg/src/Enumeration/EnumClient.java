package Enumeration;

public enum EnumClient {
	
	//le dialogue du client
	Client("\nClient : Alors oui bonjour j'aimerais un animal s'il vous plait"),
	ClientBis("\nClient : D'accord presentez moi un peu les animaux que vous avez "),
	Clientprime("\nClient : D'accord je vais reflechir");
	
		
	private String Choice;
		
	EnumClient(String Choice){
		this.Choice = Choice;
			
		}
		
		public String Chx(){
			return Choice;
		}
		

}
