package Test;
import java.util.ArrayList;

public class ShapeTest {
	
	public static void main(String[] args){
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Ractanger(20,20));
		shapes.add(new Square(20));
		shapes.add(new Circle(20));
		shapes.add(new Triangle(20,20,20));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
	public static double  getTotalArea(ArrayList<Shape> shapes){
		double totalarea=0;
		for(int i=0;i<shapes.size();i++){
			totalarea+=shapes.get(i).getArea();
		}
		return totalarea;
	}
}

