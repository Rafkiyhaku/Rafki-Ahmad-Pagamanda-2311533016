package pekan3;

import java.util.Scanner;

public class CekUmur2 {

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
					System.out.println("Anda sudah dewasa dan boleh mengemudi");
					
				} else {
					System.out.println("Anda masih anak anak dan belum boleh mengemudi");
					
					
				}

	}

}
