package Test;

public class Circle extends Shape {
   public Circle(double radious){
	   super(radious);
	   }
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radious*radious;
	}

}
