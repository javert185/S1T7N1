package s1t7n1exercici2;

public class Main {
	
	//Suprimim els warnings dels mètodes	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Creem una instància de treballador online
		TreballadorOnline treballador1 = new TreballadorOnline("Ana", "García", 40);
		
		//Creem una instància de treballador presencial
		TreballadorPresencial treballador2 = new TreballadorPresencial("Maria", "Alonso", 45);
		
		//Creem una instància de treballador
		Treballador treballador3 = new Treballador("Helena", "Casa", 35);		
		
		//Cridem el mètode calcularSou, treballant 50 hores mensuals
		int souTreballador1 = treballador1.calcularSou(50);
		System.out.println(souTreballador1);
		
		//Cridem el mètode calcularSou, treballant 50 hores mensuals i la benzina costant 60
		TreballadorPresencial.setBenzina(60);
		int souTreballador2 = treballador2.calcularSou(50);
		System.out.println(souTreballador2);
		
		//Cridem el mètode calcularSou, treballant 50 hores mensuals	
		System.out.println(treballador3.calcularSou(50));
		
		//Cridem els mètodes obsolets i com hem aplicat SupressWarnings, el programa no ens mostra que els mètodes estan obsolets 
		TreballadorOnline.metodeObsolet();
		TreballadorPresencial.metodeObsolet();
	}
}