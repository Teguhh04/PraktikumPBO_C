package Praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

class Cat extends Hewan{
	String warna;
	int berat;
	public void identitas(String namaKucing, String warnakucing, int beratkucing) {
		Cat.name = namaKucing;
		warna = warnakucing;
		berat = beratkucing;
	}
	public void eat() {
		System.out.println(Cat.name+ " Makan Wishkas");
	}
	String ambilnama() {
		return Cat.name;
	}
	String ambilwarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
	
}