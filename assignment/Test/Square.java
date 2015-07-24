package Test;

public class Square extends Shape {
	 public Square(double length){
    	 super(length,length);
     }
	 
	 public double getArea() {
			return length*width;
		}

	}
