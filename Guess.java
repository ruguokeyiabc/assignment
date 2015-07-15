import java.util.*;
public class Guess {
	public static int guess(int x){
		int cnt=1;
		int left=0;
		int right=100;
		int mid=(left+right)/2;
		while(left<right&&mid!=x){
			if(mid<x) left=mid+1;
			else if(mid>x) right=mid-1;
			mid=(left+right)/2;
			cnt++;
		}
		return cnt; 
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String num;
		do{System.out.print("please input x value(0-100):");
		Scanner sca=new Scanner(System.in);
		int x=sca.nextInt();
		if(x<0||x>100) System.out.print("error!"+"\n");
		else{System.out.println("cnt is:"+guess(x));}
		System.out.println("continue? yes--y no--n");
		num=in.next();
		}while(num.equals("y"));
	}
}
