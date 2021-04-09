package mentoring_4_1;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		Iki degisken atayin : 
		num1=1,
		num2=1 
		‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
		Note: ++ increment isareti 1 arttirir. 
		Asagidaki sekilde Carpim Tablosunu yazdirin:
		1 X 1 = 1
		1 X 2 = 2  
		1 X 3 = 3
		...
		1 X 10 =10
		*/
          
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen carpim tablosu icin bir rakam girin");
        int sayi=scan.nextInt();
         for (int i = 1; i <=sayi; i++) {
        	 
        	 for (int j = 1; j <=sayi; j++) {
        		 
        		 System.out.print(i*j+" ");
				
			}
        	 
			System.out.println("");
		}
       scan.close();
	        
	    }
}
