package Praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		Cat kucingSaya = new Cat();
		
		System.out.print("Masukan nama kucing : ");
		nama = input.next();
		
		System.out.print("Masukan warna kucing : ");
		warna = input.next();
		
		System.out.print("Masukan berat kucing : ");
		berat = input.nextInt();
		
		kucingSaya.identitas(nama, warna, berat);
		kucingSaya.eat();
		
		System.out.println("Kucing "+kucingSaya.ambilnama()+" warnanya "+kucingSaya.ambilwarna()+" beratnya "+kucingSaya.ambilBerat()+"kg"+ " ada diteras");
	}

}
