import java.util.Scanner;

public class java_01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원 >>> )");
		double won=scanner.nextDouble();
		Double dal=won/1100;
		
		System.out.println(won+"원은 $"+dal+"입니다");
	}

}
