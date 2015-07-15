import java.util.Scanner;
public class IsLeasp {
	public  static boolean isLeap(int year){
		if(year%100==0){
			if(year%400==0) return true;
			else return false;
		}
		else if(year%4==0) return true;
		else return false;
	}
	public static void main(String[] args){
		   Scanner in=new Scanner(System.in);
		   String num;
		do{
			System.out.print("please input a year value:");
			Scanner sca=new Scanner(System.in);
			int year=sca.nextInt();
			if(year<=0) System.out.println("error!");
			else System.out.println(isLeap(year)+"!"+"\n"+year+" is leap");
			System.out.println("continue? yes--y no--n");
			num=in.next();
		}while(num.equals("y"));
	}
}
