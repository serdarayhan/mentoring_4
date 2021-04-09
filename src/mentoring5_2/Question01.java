package mentoring5_2;

public class Question01 {

	public static void main(String[] args) {
		 
		   /*
        //Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
        //1.Yol: 3. degisken kullanarak 
        //2.Yol: 3. degisken kullanmadan
*/
ans1();
ans2();
}
public static void ans1 () {

int num1 = 8;
int num2 = 10;

int temp =num1;

temp=num1;
num1=num2;

System.out.println("Value of num1: " + num2);
System.out.println("Value of num2: " + temp);

System.out.println("_________________________");
}

public static void ans2 () {

int num1 = 8;
int num2 = 10;

num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

System.out.println("Value of num1: " + num1);
System.out.println("Value of num2: " + num2);


}
}