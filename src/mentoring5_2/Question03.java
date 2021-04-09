package mentoring5_2;

import java.util.HashSet;
import java.util.Set;

public class Question03 {

	public static void main(String[] args) {

		 /* 3.
		         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
		         * sayilardan olusan bir array haline getiren bir program yaziniz.
		         *
		         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
		         * OUTPUT : [1,2,3,4,5,6,7,8,9]
		         */
		
		int arr[]= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
		
		int tekrarsizArray[] = tekrarlarisil(arr);


	}

	public static int[] tekrarlarisil(int[] arr) {
		
		Set<Integer> set1 = new HashSet<>();
		for (Integer each : arr) {
			
			set1.add(each);
			
		}
		
		System.out.println(set1);
		
		return null;
	}


}
