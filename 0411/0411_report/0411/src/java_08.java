
public class java_08 extends Point{
	public java_08() {
		super(0, 0);
	}
	public void move(int x, int y) {
		if(x >= 0 && y >= 0)
			main(x, y);
	}
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ")의 점";
	}
	public static void main(String[] args) {
		java_08 p = new java_08();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		java_08 p2 = new java_08();
		System.out.println(p2.toString() + "입니다.");
	}
}
