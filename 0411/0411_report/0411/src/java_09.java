import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack{
	private int i = -1, length = 0, capacity;
	private String []Array;
	public StringStack() {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		this.capacity = scanner.nextInt();
		Array = new String[capacity];
	}
	public int length() {
		return length;
	}
	public int capacity() {
		return capacity;
	}
	public String pop() {
		i++;
		return Array[i];
	}
	public boolean push(String val) {
		if (length >= capacity) return true;
		else {
			Array[length] = val;
			length++;
			return false;
		}				
	}
}
public class java_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack ss = new StringStack();
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.nextLine();
			if(str.equals("그만")) break;
			else if(ss.push(str)) {
				System.out.println("스택이 꽉 차서 푸시 불가.");
				continue;
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i = 0; i < ss.capacity(); i++) {
			System.out.print(ss.pop() + " ");
		}
		scanner.close();
	}
}
