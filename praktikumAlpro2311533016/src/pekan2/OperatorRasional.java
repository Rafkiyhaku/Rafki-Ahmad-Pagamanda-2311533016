package pekan2;

import java.util.Scanner;

public class OperatorRasional {
	
		public static void main(String[] args) {
				int A1;
				int A2;
				boolean hasil;
				Scanner keyboard = new Scanner(System.in);
						System.out.print("input angka-1:");
				A1 = keyboard.nextInt();
				System.out.print("input angka-2:");
				A2= keyboard.nextInt();
				keyboard.close();
				hasil = A1 >A2; // apakah A1 lebih besar A2?
				System.out.println("A1 > A2 = "+hasil);
				hasil = A1 < A2; // apakah A1 lebih kecil A2?
				System.out.println("A1 < A2 = "+hasil);
				hasil = A1 >+A2; // apakah A1 lebih besar sama dengan A2?
				System.out.println("A1 >= A2 = "+hasil);
				hasil = A1 <=A2; //apakah A1 lebih kecil sama dengan A2?
				System.out.println("A1 <= A2 = "+hasil);
				hasil = A1 ==A2; //apakah A1 sama dengan A2?
				System.out.println("A1 == A2 = "+hasil);
				hasil = A1 !=A2; //apakah A1 tidak sama dengan A2?
				System.out.println("A1 != A2 = "+hasil);
				
		}

}
