package mentoring_4_2;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        /*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */
        
        System.out.println("Lutfen is unvaninizi giriniz");
        Scanner scan = new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();
        String qa = "qa";
        String dev = "dev";
        String ba = "ba";
        String pm = "pm";
        if (jobTitle.equals(qa)) { // ali == ahmet
            System.out.println("Is unvaniniz Quality Analyst");
        } else if (jobTitle.equals(dev)) {
            System.out.println("Is unvaniniz Developer");
        } else if (jobTitle.equals(ba)) {
            System.out.println("Is unvaniniz Business Analyst");
        } else if (jobTitle.equalsIgnoreCase(pm)) {
            System.out.println("Is unvaniniz Project Manager");
        } else {
            System.out.println("Lutfen tekrar deneyiniz ve qa , dev , ba , pm seklinde unvan giriniz");
        }
        
scan.close(); }
}