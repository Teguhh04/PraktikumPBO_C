package TugasPbo;

public class Kalkulator {
	private double value1;
	private double value2;
	public double getValue1() {
		System.out.println("VALUE1 : "+value1);
		return value1;
	}
	public void setValue1(double value1) {
		
		this.value1 = value1;
	}
	public double getValue2() {
		System.out.println("VALUE2 : "+value2);
		return value2;
	}
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	public void setNamaProject() {
		System.out.println("Project Calculator");
	}
	public void setNoteProject(String note) {
		System.out.println(note);
	}
	public double add(double val1,double val2) {
		double hasil;
		hasil = val1+val2;
		System.out.println("Result Add is : "+hasil);
		return hasil;
	}
	public double minus(double val1,double val2) {
		double hasil;
		hasil = val1-val2;
		System.out.println("Result Minus is : "+hasil);
		return hasil;
	}
	public double multiplication(double val1,double val2) {
		double hasil;
		hasil = val1*val2;
		System.out.println("Result Multiple is : "+hasil);
		return hasil;
	}
	public double division(double val1,double val2) {
		double hasil;
		hasil = val1/val2;
		System.out.println("Result Division is : "+hasil);
		return hasil;
	}
	public static void main(String args[]) {
		Kalkulator kal1 = new Kalkulator();
		double v1 = 7.0;
		double v2 = 5.0;
		kal1.setValue1(v1);
		kal1.getValue1();
		kal1.setValue2(v2);
		kal1.getValue2();
		kal1.setNamaProject();
		kal1.setNoteProject("This Project shown you how to manage method in java");
		kal1.add(v1, v2);
		kal1.minus(v1, v2);
		kal1.multiplication(v1, v2);
		kal1.division(v1, v2);
	}
	
	
}
