class Point{
	private int x, y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void main(int x, int y) {this.x = x; this.y = y;}
}

public class java_05 extends Point{
	private String color;
	public java_05(int x, int y, String color) {
		super(x, y);
		this.color = color;
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
		java_05 cp = new java_05(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
