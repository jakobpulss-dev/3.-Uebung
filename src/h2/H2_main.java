package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr;
		boolean schalt;
		
		jahr=1675;
		schalt=false;
		if (jahr%400==0) {
			schalt=true;
		}else {if (jahr%100==0) {
			schalt=false;
		}else {if(jahr%4==0) {
			schalt=true;
		}else {schalt=false;}}}
		
		System.out.println("Das Jahr"+jahr);
		System.out.println("Ist ein Schaltjahr:"+schalt);
	}
}

		


