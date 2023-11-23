package praktikum2;
import java.util.Scanner;
public class PengkondisianIF {
	public static void main(String args[]) {
// inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perhitungan;
// input user 
		System.out.print("Masukan Angka1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka2 : ");
		angka2 = input.nextInt();
		System.out.print("List perhitungan : "
				+"\n 1 : pertambahan"
				+"\n 2 : pengurangan"
				+"\n 3 : perkalian"
				+"\n 4 : pembagian"
				+"\n Masukan Angka Perhitungan :");
		perhitungan = input.nextInt();
// kondisi IF
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("Hasil adalah : "+hasil);
		} else if (perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("Hasil adalah : "+hasil);
		} else if (perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.print("Hasil adalah : "+hasil);
		} else if (perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("Hasil adalah : "+hasil);	
		} else {
			System.out.print("Angka yang dimasukan salah!");
		}
	}
}
