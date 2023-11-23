package Praktikum4;

public class Tabungan {
	public int saldo;
	public Tabungan(int inintSaldo) {
		saldo = inintSaldo;
	}
	public void ambiluang(int jumlah) {
		saldo = saldo - jumlah;
	}
}
