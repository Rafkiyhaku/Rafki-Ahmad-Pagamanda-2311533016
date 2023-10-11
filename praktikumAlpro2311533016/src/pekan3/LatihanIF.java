package pekan3;

import java.util.Scanner;

public class LatihanIF {

	public static void main(String[] args) {
		double IPK ;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Masukkan nilai IPK: ");
		IPK=input.nextDouble();
		
		if (IPK >2.75) {
			System.out.println("Anda lulus sangat memuaskan");
		}
		else {
			System.out.println("Mohon maaf anda dinyatakan belum lulus");
		}

	}

}
