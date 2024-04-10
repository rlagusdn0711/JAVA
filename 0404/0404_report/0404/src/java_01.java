class TV{
	private String manufacturer;
	private int year;
	private int inch;
	
	public TV(String manufacturer, int year, int inch) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.inch = inch;
	}
	public void showTV() {
		System.out.println(manufacturer + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
public class java_01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.showTV();
	}
}
