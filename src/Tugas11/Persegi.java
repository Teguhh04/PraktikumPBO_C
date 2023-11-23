package Tugas11;

public class Persegi {
	private double sisi;
	public double getSisi() {
		return sisi;
	}
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	public double hitungKeliling(){
		double keliling;
		keliling = sisi * 4;
		System.out.println("Keliling persegi : "+keliling);
		return keliling;
	}
	public double hitungLuas() {
		double luas;
		luas = sisi * sisi;
		System.out.println("Luas persegi : "+luas);
		return luas;
	}

}
