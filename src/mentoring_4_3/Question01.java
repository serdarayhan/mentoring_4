package mentoring_4_3;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		 
		/* 	Question01		
		           Kullan�c�n�n girmi� oldu�u A,B,C,D,F notlar�n�n kar��l���n� yazd�ran Switch Case java kodunu yaz�n�z.					
		           A	Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing								
				 */
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen notunuza kar�ilik gelen harfi  giriniz");
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
