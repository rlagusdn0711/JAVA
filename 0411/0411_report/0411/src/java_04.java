import java.util.Scanner;

public class java_04 extends Converter{
	private double oneMile;
	public java_04(double oneMile) { 
		this.oneMile = oneMile;
	}
	protected double convert(double src) {return src / oneMile;}
	protected String getSrcString() {return "Km";}
	protected String getDestString() {return "Mile";}
	
	public static void main(String[] args) {
		java_04 toDollor = new java_04(1.6);
		toDollor.run();
	}
}	
