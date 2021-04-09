package mentoring4_4;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		// Kullanýcýdan bir isim ve karakter girmesini isteyin,
        //sonra karakterin kaç kez tekrarlandýðýný kontrol edin.
        
Scanner scan = new Scanner(System.in);
System.out.println("Lutfen bir cumle giriniz");
        
String cumle = scan.nextLine();
        
System.out.println("Lutfen bir harf giriniz");
        
String harf = scan.next().substring(0, 1); 
        
    int count=0;
        
        int index=0;
        
            while (index<cumle.length()) {
            
                if (cumle.substring(index, index+1).equals(harf)) {
                count++;
                
            } 
            index++;
        } 
        System.out.println("Cumlede " + harf + " harfi " + count + " defa kullanilmis");
        System.out.println("kelime uzunlugu: " + index);
        scan.close();

	}

}
