package mentoring_4_3;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		 
		/*Question05
		Kullan�c�dan bir kelime girmesini isteyin. 
		S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa,
		 kelimenin ortas�ndaki karakteri yazd�r�n.
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
