package mentoring_4_2;
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        /*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa “gecerli bir email girin” yazdirin
       @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
       @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : “gecerli bir email girin”
       INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
       INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
       */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String mail = scan.next(); // ksajdkajd@gmail.com
        
        int isaret = mail.indexOf('@', -10);
        int gmail = mail.indexOf("@gmail.com", mail.length()-10); // klqwejqw@gmail.com
        
        /*int ilkIsaret = mail.indexOf('@');
        int sonIsaret = mail.lastIndexOf('@'); */
        
        if (isaret==-1 || mail.charAt(0)=='@') {
            System.out.println("Gecerli bir mail giriniz");
        } else if (mail.endsWith("@gmail.com") && gmail==-1) {
            System.out.println("Lutfen gmail hesabinizi girin");
        } else {
            System.out.println("Email onaylandi");
        }
        /*
         if (!mail.contains("@")) {
                System.out.println("Girdiginiz bilgi email degil");
            } else if (!mail.contains("@gmail.com")){
                System.out.println("Lütfen gmail adresi yazin");
            } else if (mail.endsWith("@gmail.com") && mail.indexOf("@gmail.com", mail.length()-10)==-1){
                System.out.println("Email adresiniz basariyla kaydedilmistir");
            } else {
                System.out.println("Lütfen gecerli bir mail adrsi giriniz");
            }
        */
scan.close();   }
}
