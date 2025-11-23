package pekan7_2511532025;

import java.util.Scanner;

public class TugasAlproPekan7_2511532025 {

	public static void main(String[] args) {
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Username: ");
		String u = input.nextLine();
		
		System.out.print("Masukkan Password: ");
		String p = input.nextLine();
		
		System.out.print("Masukkan Email: ");
		String e = input.nextLine();
		
		System.out.print("Masukkan PIN (6 Digit): ");
		int pin = input.nextInt();
		
		Akun_2511532025 a = new Akun_2511532025();
		a.setUsername(u);
		a.setPassword(p);
		a.setEmail(e);
		a.setPIN(pin);
		
		System.out.println();
		
		if (!a.isPasswordValid() || !a.isEmailValid()) {
			System.out.println("--- REGISTRASI GAGAL ---");
	
		if (!a.isPasswordValid()) {
			System.out.println("Password terlalu panjang/pendek. Password Anda \"" + a.getPassword() + "\" memiliki " + a.getPassword().length() + " karakter.");
		}
		if (!a.isEmailValid()) {
			System.out.println("Email anda \"" + a.getEmail() + "\" tidak valid (harus mengandung '@' dan '.')");
		}
		System.out.print("Silahkan coba lagi.");
	}
		else {
			System.out.println("--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \"" + a.getUsername() + "\" telah berhasil dibuat.");
			
			System.out.println();
			
			System.out.println("--- Detail Akun ---");
			System.out.println("Username: " + a.getUsername().toLowerCase());
			System.out.println("Email: " + a.getEmail().toUpperCase());
			System.out.println("ID Pengguna: " + a.getUsername() + a.getPIN());
			
			System.out.println();
		
			System.out.println("--- Uji Tipe Data (PIN Anda: " + a.getPIN() + ") ---");
			System.out.println("PIN (int) + 10 = " + (a.getPIN() + 10));
			System.out.println("PIN (String) + \"10\" = " + (String.valueOf(a.getPIN()) + "10"));

			}
	}
}
