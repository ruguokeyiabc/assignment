import java.util.Scanner;
public class GetDays {
	public  static int getdays(int year){
		return(((year%100==0&&year%400==0)||(year%4==0))?366:365);
	}
	
	
	/*请问老师为什么这个用ＡＳＣＩＩ码值判断不了负值？
	 * public static boolean isNumeric(String str){
	
		for(int i=str.length();--i>=0;){
			char chr=str.charAt(i); //返回指定索引处的 char 值
			if(chr>47&&chr<58) return true;
		}
		return false;
	
		}*/
	
	
	public static boolean isNumeric(String str){
		for (int i = str.length();--i>=0;){   
			if (!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	
    public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   String num;
	do{
		System.out.print("please input a year value:");
		Scanner sca=new Scanner(System.in);
		String year=sca.next();
	    boolean y=isNumeric(year);
	    if(y==true) {int yy=Integer.parseInt(year);

	    	
	    	System.out.println(getdays(yy));
	    }
	    else System.out.println("error!!!");
		System.out.println("continue? yes--y no--n");
		num=in.next();
	}while(num.equals("y"));
  }
}
