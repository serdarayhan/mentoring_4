package mentoring_4_3;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		 
		/* Question06
		Kullan�c�dan firstName ve lastName'i girmesini isteyin,
		 ard�ndan ba� harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda yazdirin.          
		
		ferhat => Ferhat
		          	kirac => Kirac
		          */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please write your name");
        String name = scan.next();
        System.out.println("Please write your surname");
        String surname = scan.next();
        
        System.out.println(name.toUpperCase().charAt(0) + name.substring(1, name.length()) + " " +
                surname.toUpperCase().charAt(0) + surname.substring(1, surname.length()));
	    
	    


	}

}
