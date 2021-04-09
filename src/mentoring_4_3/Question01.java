package mentoring_4_3;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		 
		/* 	Question01		
		           Kullanýcýnýn girmiþ olduðu A,B,C,D,F notlarýnýn karþýlýðýný yazdýran Switch Case java kodunu yazýnýz.					
		           A	Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing								
				 */
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen notunuza karþilik gelen harfi  giriniz");
	       String harf =scan.next().toUpperCase();
	       
	       switch (harf) {
	       case "A" : System.out.println("Excellent");
	       break;
	       case "B" : System.out.println("Good");
	       break;
	       case "C" : System.out.println("Average");
	       break;
	       case "D" : System.out.println("Deficient");
	       break;
	       case "E" : System.out.println("Failing");
	       break;
	       
	       default: System.out.println("Lutfen gecerli bir harfi girin");
	       
	       
	       
	       
	       }

 
	}

}
