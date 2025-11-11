package pekan7_2511532025;

import java.util.Scanner;

public class PanggilMahasiswa2_2511532025 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		String x = input.nextLine();
		System.out.print("Nama: ");
		String y = input.nextLine();
		Mahasiswa_2511532025 a = new Mahasiswa_2511532025();
		a.setNim2(x);
		a.setNama(y);
		if(a.getNim2().startsWith("25")) {
			System.out.println(a.getNama() + " anda angkatan 2025");
		}
		if(a.getNim2().contains("1153")) {
			System.out.println("Anda Mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();
	}

}
