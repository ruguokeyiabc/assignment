
import java.util.*;
public class ID {
	public static boolean isNumeric(String str){
		if(str.length()==18) {
			for(int i=str.length()-1;--i>=0;){
				int chr=str.charAt(i);
				if((chr<48 || chr>57)&&(str.length()<48||str.length()>57||str.length()!=88))
					return false;
			}
			return true;
		}
	else return false;
}
	public static void main(String[] args){
		System.out.println("请输入你的身份证号码：");
		Scanner sca=new Scanner(System.in);
		String arr=sca.next();
		if(isNumeric(arr)){
			String[] p=new String[18];
			Integer[] q=new Integer[17];
			for(int i=0;i<18;i++){
				p[i]=String.valueOf(arr.charAt(i));}
			for(int kk=0;kk<17;kk++){
				q[kk]=Integer.parseInt(p[kk]);

			}
			int[] aa=new int[17];
			int sum=0;
			int[] l={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
			for(int ii=0;ii<17;ii++){
				aa[ii]=q[ii]*l[ii];
				sum=sum+aa[ii];
			}
			int s=sum%11;
			int mm=0;
			switch(s){
			case 0:if(p[17].equals("1")) System.out.println("合法");else mm=-1;break;
			case 1:if(p[17].equals("0")) System.out.println("合法");else mm=-1;break;
			case 2:if(p[17].equals("X")) System.out.println("合法");else mm=-1;break;
			case 3:if(p[17].equals("9")) System.out.println("合法");else mm=-1;break;
			case 4:if(p[17].equals("8")) System.out.println("合法");else mm=-1;break;
			case 5:if(p[17].equals("7")) System.out.println("合法");else mm=-1;break;
			case 6:if(p[17].equals("6")) System.out.println("合法");else mm=-1;break;
			case 7:if(p[17].equals("5")) System.out.println("合法");else mm=-1;break;
			case 8:if(p[17].equals("4")) System.out.println("合法");else mm=-1;break;
			case 9:if(p[17].equals("3")) System.out.println("合法");else mm=-1;break;
			case 10:if(p[17].equals("2")) System.out.println("合法");else mm=-1;break;
			default:System.out.println("不合法");
			}
			if(mm==-1){System.out.println("不合法");}
		}
		else {System.out.println("输入不合法");}
	}

}



