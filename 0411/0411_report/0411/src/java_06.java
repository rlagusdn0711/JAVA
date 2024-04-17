
public class java_06 extends Point{
	private String color;
	public java_06() {
		super(0, 0);
		color = "BLACK";
	}
	public java_06(int x, int y) {
		super(x, y);
	}
	public void setXY(int x, int y) {
		main(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
	}
	public static void main(String[] args) {
		java_06 zeroPoint = new java_06();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		java_06 cp = new java_06(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
