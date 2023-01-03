package Enumeration;

public enum EnumVendeur {
	
	//le dialogue du responsable du magasin
	Responsable("Responsbale : Bonjour que puis-je faire pour vous aider ? "),
	ResponsableBis("\nResponsable : Oui effectivement nous pouvons vous orienter chez un vendeur specialisé dans ce domaine ");
	

	
	private String typeAnimal;
	
	EnumVendeur(String typeAnimal){
		this.typeAnimal= typeAnimal;
		
	}
	
	public String RC(){
		return typeAnimal;
	}
	

}
