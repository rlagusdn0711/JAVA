interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
}
public class java_13 implements Shape{
	private int radius;
	public java_13(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public static void main(String[] args) {
		Shape donut = new java_13(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
