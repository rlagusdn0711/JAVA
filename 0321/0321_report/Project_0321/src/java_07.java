import java.util.Scanner;

public class java_07 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오 >>");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		if((100<=x && x<=200)&&(100<=y && y<=200)) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다");
		}
	}

}
