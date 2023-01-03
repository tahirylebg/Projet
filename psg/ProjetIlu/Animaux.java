package SPA;

public abstract class Animaux {
	
	private String nom;
	private int size;
	private double height;
	private float prize;
	
	public Animaux (String nom, float prize,int size,double height){
		this.nom=nom;
		this.prize=prize;
		this.size=size;
		this.height=height;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	
	
	}
	