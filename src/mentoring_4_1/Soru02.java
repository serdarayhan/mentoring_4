package mentoring_4_1;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* 2
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun.
		 Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/  

		
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Lutfen gunde kac cay ictiginizi girin : ");
       double cay =scan.nextDouble();
       
       
       System.out.println("cayi kac sekerli ictiginizi yazin : ");
       double seker =scan.nextDouble();
      
      System.out.println((seker*1.7 *cay*365)/1000);
      scan.close();
   
	}
}

