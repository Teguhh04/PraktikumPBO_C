package TugasPbo;

public class Fisika {
	public static double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public static double hitungUsaha(double massa, double kecepatanAwal, double kecepatanAkhir) {
        return 0.5 * massa * (kecepatanAkhir * kecepatanAkhir - kecepatanAwal * kecepatanAwal);
    }
    

}
