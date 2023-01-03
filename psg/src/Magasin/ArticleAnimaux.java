package Magasin;

public class ArticleAnimaux {

	private String nomAnimaux;
	private int prixAchat;
	
	public ArticleAnimaux(String nomAnimaux, int prixAchat){
		this.nomAnimaux=nomAnimaux;
		this.prixAchat=prixAchat;
	}
	
	public String getNomAnimaux() {
		return nomAnimaux;
	}
	public void setNomAnimaux(String nomAnimaux) {
		
		
		this.nomAnimaux = nomAnimaux;
		
	}
	public int getPrixAchat() {
		
		return prixAchat;
	}
	public void setPrixAchat(int prixAchat) {
		
		this.prixAchat = prixAchat;
	}
	
	
}
