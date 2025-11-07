package h3;

public class H3_main {
	public static void main(String[] args) {
		int max, fix, wartend, übrig;
		boolean istVoll;
		
		max=5;
		fix=2;
		wartend=2;
		istVoll=false;
		
		übrig=max-fix;
		if (übrig==wartend) {
			istVoll=true;
			wartend=0;
			übrig=0;
		}else {if (übrig>wartend) {
			istVoll=false;
			übrig=übrig-wartend;
			wartend=0;}
		else { istVoll=true;
				wartend=wartend-übrig;
				übrig=0;}
		}
		fix=max-übrig;
		System.out.println("Wartend"+wartend);
		System.out.println("Maximale Anzahl an noch freien Plätzen"+übrig);
		System.out.println("Fixplätze"+fix);
		System.out.println("Ist der Kurs voll"+istVoll);
		}
	}


