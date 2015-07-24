package Test;

public class Triangle extends Shape {
	 public Triangle(double length,double width,double size){
    	 super(length,width,size);
     }

	public double getArea() {
		double p=(length+width+size)/2;
		return Math.sqrt(p*(p-length)*(p-width)*(p-size));
	}

}
