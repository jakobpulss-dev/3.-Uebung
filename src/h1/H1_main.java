package h1;

public class H1_main {
	public static void main(String[] args) {
		int rating;
		double guthaben, monEingang;
		boolean warnhinweis, negativ;
		guthaben=-100;
		rating=-2;
		monEingang=200;
		
		
		negativ=false;
		warnhinweis=false;
		if (guthaben>0) { 
			rating=rating+3;
		}else {	
		if (guthaben<0) {
			negativ=true;
		
		} else rating=rating+2; }  
	
		if(guthaben<0) {
		guthaben=guthaben+monEingang;
		if (guthaben>0) {
			rating=rating+1;
			
		}else { if (guthaben<0) {
			rating=rating-1; }
		else rating=rating+1; }
		}
			
		if (guthaben<0) {
			warnhinweis=true;
		System.out.println("warnung ihr Konot ist im Minus");}
		
		
		
		System.out.println("ihr rating ist"+rating);
		System.out.println("ihr guthaben beträgt"+guthaben);
		System.out.println("negativität des Konots ist"+negativ);
		
	}
}



