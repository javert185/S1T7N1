package s1t7n1exercici1;

public class TreballadorOnline extends Treballador {
	
	public TreballadorOnline(String nom, String cognom, int preu_hora) {
		super(nom, cognom, preu_hora);
	}

	final int tarifa_plana = 40;
	
	@Override
	public int calcularSou(int hores_treballades_mes) {
		int sou = hores_treballades_mes * getPreu_hora() + tarifa_plana;
		
		//Això ens permetrà identificar la funció de l'anotació Override
		System.out.println("El sou del treballador online és: ");
		
		return sou;
	}
	
	
}