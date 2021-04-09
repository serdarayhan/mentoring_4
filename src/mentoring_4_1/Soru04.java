package mentoring_4_1;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {

		/* 4
		Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/

      Scanner  scan = new Scanner(System.in);
      System.out.println("Lutfen 3 basamakli bir pozitif sayi girin");
      int sayi =scan.nextInt();
     
     
    int birlerBas=sayi %10;
    sayi=sayi/10;
    
    int onlarBas=sayi%10;
    sayi=sayi/10;
    
    int yuzlerBas=sayi%10;
    
    
    System.out.print("sayilarin basamaklarý toplamý : " + (birlerBas+onlarBas+yuzlerBas));
    		 
 scan.close();
     }	
}
