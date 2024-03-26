import java.util.Scanner;

public class java_03 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("금액을 입력하시오 >>> ");
		int num=scanner.nextInt();
		
		System.out.println("오만원 "+num/50000+"개");
		num%=50000;
		System.out.println("만원군 "+num/10000+"개");
		num%=10000;
		System.out.println("천원권 "+num/1000+"개");
		num%=1000;
		System.out.println("백원 "+num/100+"개");
		num%=100;
		System.out.println("오십원 "+num/50+"개");
		num%=50;
		System.out.println("깁원 "+num/10+"개");
		num%=10;
		System.out.println("일원 "+num/1+"개");

	}

}
