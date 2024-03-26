import java.util.Scanner;

public class java_02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("두자리수 정수 입력 >>> ");
		int num=scanner.nextInt();
		if(num%11==0) {
			System.out.println("yes! 10의 자리와 1의 자리가 같습니다.");
		}
	}

}
