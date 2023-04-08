package s1t7n1exercici2;

public class Treballador {
	
	private String nom;
	private String cognom;
	private int preu_hora;
	
	public int calcularSou(int hores_treballades) {
		
		int sou = hores_treballades * getPreu_hora();
		
		//Això ens permetrà identificar la funció de l'anotació Override
		System.out.println("El sou del treballador és: ");
				
		return sou;		
	}
	
	public int getPreu_hora() {
		return preu_hora;
	}
	
	public Treballador(String nom, String cognom, int preu_hora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preu_hora = preu_hora;		
	}
}