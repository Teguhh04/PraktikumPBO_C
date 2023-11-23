package Praktikum4;
import java.util.Scanner;

public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan Jumlah Saldo :");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.print("Saldo Awal : "+tabungan.saldo);
		
		System.out.print("Masukan Saldo penarikan: ");
		tariktunai = input.nextInt();
		tabungan.ambiluang(tariktunai);
		System.out.print("Jumlah uang yang diambil : "+tariktunai);
		System.out.print("Saldo Sekarang : "+tabungan.saldo);
	}
}
