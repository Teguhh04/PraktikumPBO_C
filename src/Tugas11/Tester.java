package Tugas11;
import java.util.Scanner;
public class Tester {
	public static void main(String args[]) {
		Persegi persegi = new Persegi();
		Scanner input = new Scanner(System.in);
		double sisi;
		
		System.out.print("masukan sisi persegi : ");
		sisi = input.nextDouble();
		persegi.setSisi(sisi);
		persegi.getSisi();
		persegi.hitungKeliling();
		persegi.hitungLuas();
		
		System.out.print("<<<========================>>>\n");
		
		double panjang, lebar;
		PersegiPanjang perpan = new PersegiPanjang();
		System.out.print("masukan panjang persegi panjang : ");
		panjang = input.nextDouble();
		perpan.setPanjang(panjang);
		perpan.getPanjang();	
		System.out.print("masukan lebar persegi panjang : ");
		lebar = input.nextDouble();
		perpan.setLebar(lebar);
		perpan.getLebar();
		perpan.hitungKeliling();
		perpan.hitungLuas();
	}

}
