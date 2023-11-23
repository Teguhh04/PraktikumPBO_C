package Praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main (String[] args) {
		System.out.println("helo world");
//		inisialisasi variable
		int angka1, angka2, hasil;
//		inisialisasi input user
		Scanner input = new Scanner(System.in);
//		inputan user
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
//		hasil inputan
		hasil = angka1 + angka2;
		System.out.println("Hasilnya : "+hasil);
		
		
		String namaDepan, namaBelakang, fullname;
		System.out.print("Masukan nama depan : ");
		namaDepan = input.next();
		System.out.print("Masukan nama belakang : ");
		namaBelakang = input.next();
		fullname = namaDepan + " " + namaBelakang;
		System.out.println(fullname);
	}
}
