package mentoring_4_3;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		  
		/*  Question02
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
		* 
			*/
		
		   Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen kacinci ayda oldugumuzu giriniz");
	        String ay = scan.nextLine().toLowerCase();
	        
	        switch (ay) {
	        
	        case "ocak":
	        case "mart":
	        case "mayis":
	        case "temmuz":
	        case "agustos":
	        case "ekim":
	        case "aralik":
	        	 System.out.println("31");
	        break;
	       
	        
	        case "subat":
	        	 System.out.println("28");
	        break;
	       
	        
	        case "nisan":
	        case "haziran":
	        case "eylul":
	        case "kasim":
	        	 System.out.println("30");
	        break;
	       
	        default : System.out.println("Lutfen gecerli bir ay ismi yazin ");
	        
	        
	        
	        /*
	        case "ocak" : System.out.println("31");
	        break;
	        case "subat" : System.out.println("28");
	        break;
	        case "mart" : System.out.println("31");
	        break;
	        case "nisan" : System.out.println("30");
	        break;
	        case "mayis" : System.out.println("31");
	        break;
	        case "haziran" : System.out.println("30");
	        break;
	        case "temmuz" : System.out.println("31");
	        break;
	        case "agustos" : System.out.println("31");
	        break;
	        case "eylül" : System.out.println("30");
	        break;
	        case "ekim" : System.out.println("31");
	        break;
	        case "kasim" : System.out.println("30");
	        break;
	        case "aralik" : System.out.println("31");
	        break;
	        default : System.out.println("Lutfen gecerli bir ay ismi yazin ");
	        
	    
	        */
	        }
	   
	}

}
