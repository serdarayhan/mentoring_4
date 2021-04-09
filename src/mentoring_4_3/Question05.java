package mentoring_4_3;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		 
		/*Question05
		Kullanýcýdan bir kelime girmesini isteyin. 
		Sözcükte tek sayýda karakter ve 3 veya daha fazla karakter içeriyorsa,
		 kelimenin ortasýndaki karakteri yazdýrýn.
		*/
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Lutfen bir kelime girin");
	    String kelime =scan.next();
	    
	    if (kelime.length()>3 && kelime.length()%2==1) {
	    	System.out.println("Orta harf: " + kelime.charAt(kelime.length()/2));
			
		} else {
			System.out.println("Cift sayi oldugu icin orta harf bulunamadi.");

		}
		
		
	


	}

}
