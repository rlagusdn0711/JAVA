import java.util.Scanner;

public class java_11_2 {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요(1~12)>>");
		Scanner m=new Scanner(System.in);
		int num=m.nextInt();
		switch(num) {
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
		}
	}
}
