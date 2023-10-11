package pekan3;

import java.util.Scanner;

public class multiIF {

	public static void main(String[] args) {
		int umur;
		char SIM;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Input Umur Anda: ");
		umur = a.nextInt();
		System.out.println("Apakah anda punya SIM C?");
		SIM =a.next().charAt(0);
		a.close();
				if ((umur >= 17) && (SIM == 'y')) {
					System.out.println("Anda sudah dewasa dan boleh menemudi");
					
				}
				if ((umur >=17) && (SIM != 'y')) {
					System.out.println("Anda sudah dewasa tetapi belum boleh mengemudi");
				}
				if ((umur <=17) && (SIM != 'y')) {
					System.out.println("Anda belum cukup umur untuk bawa motor");
				}
				if ((umur <= 17) && (SIM == 'y')) {
					System.out.println("Anda belum cukup umur untuk punya SIM");
					
				}

	}

}
