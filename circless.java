import java.util.*;
public class circless {
   public static Double getArea(double r)
   {
	   return Math.PI*r*r;
   }
   public static void main(String[] args)
   { 
	 System.out.print("please input r value:");
	 Scanner san=new Scanner(System.in);
	 double r=san.nextFloat();
	 if(r<0) System.out.println("r can not be a negative number!");
	 else System.out.println("circle Area is:"+getArea(r));
   }
}
