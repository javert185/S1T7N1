package s1t7n1exercici1;

public class TreballadorPresencial extends Treballador {
	
	public TreballadorPresencial(String nom, String cognom, int preu_hora) {
		super(nom, cognom, preu_hora);
	}

	private static int st_benzina;
	
	@Override
	public int calcularSou(int hores_treballades_mes) {
		int sou = hores_treballades_mes * getPreu_hora() + getBenzina();
		
		//Aix� ens permetr� identificar la funci� de l'anotaci� Override
		System.out.println("El sou del treballador presencial �s: ");
		
		return sou;
	}
	
	public int getBenzina() {
		return st_benzina;
	}
	
	public static void setBenzina(int benzina) {
		st_benzina = benzina;		
	}

}
