package TugasPbo;
import java.util.Scanner;

public class PembelianEmas {

	    private double beratEmas;
	    private double hargaEmasPerGram;
	    
	    public double getBeratEmas() {
	    	return beratEmas;
	    }
	    public void setBeratEmas(double beratEmas) {
	    	this.beratEmas = beratEmas;
	    }
	    public double getHargaEmasPerGram() {
	    	return hargaEmasPerGram;
	    }
	    public void setHargaEmasPerGram(double hargaEmasPerGram) {
	    	this.hargaEmasPerGram = hargaEmasPerGram;
	    }

	    public double hitungTotalBiaya(double hargaEmasPerGram,double beratEmas) {
	    	System.out.print("Harga Emas Kawin : "+hargaEmasPerGram * beratEmas);
	    	return beratEmas * hargaEmasPerGram;
	    }

	    public static void main(String[] args) {
	    	PembelianEmas pe1 = new PembelianEmas();
	    	Scanner input = new Scanner(System.in);
	    	
	    	System.out.print("beratEmas : ");
	    	double be1 = input.nextDouble();
	    	pe1.setBeratEmas(be1);
	    	pe1.getBeratEmas();
	    	
	    	System.out.print("hargaEmasPerGram : ");
	    	double hep1 = input.nextDouble();
	    	pe1.setHargaEmasPerGram(hep1);
	    	pe1.getHargaEmasPerGram();
	    	pe1.hitungTotalBiaya(be1, hep1);
	    
	    }
	
	}

