package praktikum2;
import java.util.Scanner;
public class PengkondisianSwitch {
	public static void main(String args[]) {;
// inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil; 
		String perhitungan;
// input user 
		System.out.print("Masukan Angka1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka2 : ");
		angka2 = input.nextInt();
		System.out.print("List perhitungan : "
						+"\n + : pertambahan"
						+"\n - : pengurangan"
						+"\n * : perkalian"
						+"\n / : pembagian"
						+"\n Masukan Simbol Perhitungan :");
		perhitungan = input.next();
//		kondisi switch
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : "+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : "+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : "+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : "+hasil);
			break;
		default:
			System.out.print("Simbol yang dimasukan tidak sesuai");
		}
	}
}
