package Tugas11;

public class PersegiPanjang {
	private double panjang;
	private double lebar;
	
	public double getPanjang() {
		return panjang;
	}
	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	public double getLebar() {
		return lebar;
	}
	public void setLebar(double lebar) {
		this.lebar = lebar;
	}
	public double hitungKeliling() {
		double keliling;
		keliling = (panjang + lebar) * 2;
		System.out.println("keliling persegi panjang : "+keliling);
		return keliling;
	}
	public double hitungLuas() {
		double luas;
		luas = panjang * lebar;
		System.out.println("luas persegi panjang : "+luas);
		return luas;
	}


}
