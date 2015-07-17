import java.util.*;
public class Person {
	public static void main(String[] args){
		System.out.println("请输入你的身份证号码：");
		char m;
		Scanner sca=new Scanner(System.in);
		String arr=sca.next();
		String[] p=new String[18];
		Integer[] q=new Integer[18];
		for(int i=0;i<arr.length();i++){
			m=arr.charAt(i);
			p[i]=String.valueOf(m);
			q[i]=Integer.parseInt(p[i]);

		}
		Integer[] aa=new Integer[17];
		aa[0]=q[0]*7;
		aa[1]=q[1]*9;
		aa[2]=q[2]*10;
		aa[3]=q[3]*5;
		aa[4]=q[4]*8;
		aa[5]=q[5]*4;
		aa[6]=q[6]*2;
		aa[7]=q[7]*1;
		aa[8]=q[8]*6;
		aa[9]=q[9]*3;
		aa[10]=q[10]*7;
		aa[11]=q[11]*9;
		aa[12]=q[12]*10;
		aa[13]=q[13]*5;
		aa[14]=q[14]*8;
		aa[15]=q[15]*4;
		aa[16]=q[16]*2;
		int sum=0;
		for(int j=0;j<17;j++){
			sum=sum+aa[j];
		}
		int s=sum%11;
		if(s==0||s==1||s==2||s==3||s==4||s==5||s==6||s==7||s==8||s==9||s==10)
		{
			switch(s){
			case 0:p[17]=String.valueOf('1');
			case 1:p[17]=String.valueOf('0');
			case 2:p[17]=String.valueOf('X');
			case 3:p[17]=String.valueOf('9');
			case 4:p[17]=String.valueOf('8');
			case 5:p[17]=String.valueOf('7');
			case 6:p[17]=String.valueOf('6');
			case 7:p[17]=String.valueOf('5');
			case 8:p[17]=String.valueOf('4');
			case 9:p[17]=String.valueOf('3');
			case 10:p[17]=String.valueOf('2');
			}
			for(int k=0;k<p.length;k++)
				System.out.print(p[k]);
				System.out.println("该身份证合法！");
			
		}

		else {
			System.out.printf("该身份证不合法！");
		}
	}

}