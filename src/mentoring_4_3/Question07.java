package mentoring_4_3;

public class Question07 {

	public static void main(String[] args) {
		 
		 
		/* Question07
				StringMethods:
					�ift uzunlukta bir degiskenin ilk yar�s�n� konsolda yazdirmak i�in bir Java program� yaz�niz.
			    	     ORNEK:
				     	INPUT      :  Python
					OUTPUT :   Pyt
			    */
		
		String str = "Python";
		
		if (str.length()%2==0) {
			str.substring(0,str.length()/2);
			System.out.println(str.substring(0,str.length()/2));
		}

	}

}
