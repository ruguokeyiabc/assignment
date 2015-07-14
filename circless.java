import java.util.*;
public class circless {
   public static double getArea(double r)
   {
	   return Math.PI*r*r;
   }
   public static void main(String[] args)
   { 
	 System.out.print("please input r value:");
	 Scanner san=new Scanner(System.in);
	 float r=san.nextFloat();
	 System.out.println("circle Area is:"+getArea(r));
   }
}
