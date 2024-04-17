import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
		scanner.close();
	}
}
public class java_03 extends Converter{
	private int oneDollor;
	public java_03(int oneDollor) { 
		this.oneDollor = oneDollor;
	}
	protected double convert(double src) {return src / oneDollor;}
	protected String getSrcString() {return "원";}
	protected String getDestString() {return "달러";}
	
	public static void main(String[] args) {
		java_03 toDollor = new java_03(1200);
		toDollor.run();
	}
}
