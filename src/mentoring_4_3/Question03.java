package mentoring_4_3;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		 
		/* Question03
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/
		Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen fiyat giriniz");
        
        int fiyat = scan.nextInt();
        
      System.out.println(Integer.MAX_VALUE); 
        
        String secim= fiyat>0 && fiyat <=10 ? "Ucuz" : 
        	          fiyat>10 && fiyat<20 ? "Uygun" : 
        	          fiyat>20 && fiyat<2147483647 ? "Pahali": " Gecersiz bir fiyat";
        
        
        System.out.println(secim);
        
        
       

        
        

	}

}
