import java.lang.Math;

abstract class Shape{
	double area, peremeter;
	public Shape(){

	}
	abstract void getArea();
	abstract void getPeremeter();
}
class Tringle extends Shape{
	double side1, side2, side3;

	Tringle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public void getArea(){
		double s = 0.5*(side1 + side2 + side3);
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("Area of Tringle : " + String.valueOf(area));
	}
	public void getPeremeter(){
		peremeter = side3 + side2 + side1;
		System.out.println("Peremeter of Tringle : "+ String.valueOf(peremeter));
	}
}
class Rectangle extends Shape{
	double width, height;

	Rectangle(double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	public void getArea(){
		area = width*height;
		System.out.println("Area of Rectangle : " + String.valueOf(area));
	}
	public void getPeremeter(){
		peremeter = 2*(width + height);
		System.out.println("Peremeter of Rectangle : "+ String.valueOf(peremeter));
	}
}
public class ShapeEx {
	public static void main(String[] args) {
		Tringle t = new Tringle(12, 10, 5);
		Rectangle r = new Rectangle(25, 40);
		t.getArea();
		t.getPeremeter();

		r.getArea();
		r.getPeremeter();
	}
	
}