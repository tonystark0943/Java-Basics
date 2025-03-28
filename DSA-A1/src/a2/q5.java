package a2;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		s1.area();
		t1.area();
		c1.area();
	}

}

abstract class Shape{
	int a=21, b=34;
	abstract void area();
}

class Square extends Shape{
	void area() {
		System.out.println("Area of Square: "+a*a);
	}
}

class Triangle extends Shape{
	void area() {
		System.out.println("Area of Triangle: "+(double)0.5*a*b);
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("Area of Circle: "+Math.PI*a*a);
	}
}