import java.util.Scanner;

public class java_09 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력>>");
		double p1=scanner.nextDouble();
		double p2=scanner.nextDouble();
		double r=scanner.nextDouble();
		
		System.out.println("점 입력>>");
		double x=scanner.nextDouble();
		double y=scanner.nextDouble();
		
		double distance=Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<r) {
			System.out.println("점("+x+", "+y+")은 원 안에 있다.");
		}
	}
}
