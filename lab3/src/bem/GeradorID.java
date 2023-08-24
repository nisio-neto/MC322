package bem;

import java.lang.Math;

public class GeradorID{
	//Atributos da Classe
	private int intid;
	private String id;
	private double rand;

	//Construtor da Classe
	public String gerarId() {
		this.rand = Math.random();
		this.rand = rand*1000000;
		this.intid = (int)rand;	
		this.id = Integer.toString(intid);
		return id;
    	   }
	
	//getter intid
	public int getIntid() {
		return intid;
	}
	
	//setter intid
	public void setIntid(int intid) {
		this.intid = intid;
	}
	
	//getter ID
	public String getId() {
		return id;
	}
	
	//setter ID
	public void setId(String id) {
		this.id = id;
	}
	
	//getter Rand
	public double getRand() {
		return rand;
	}
	
	//setter and
	public void setRand(double rand) {
		this.rand = rand;
	}
}   