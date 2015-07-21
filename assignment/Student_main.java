package student;
import java.util.*;
import progammer.Student;
public class Student_main{
	public static void main(String[] args){
		System.out.println("请输入姓名");
		Scanner in_s=new Scanner(System.in);
		String name=in_s.next();

		System.out.println("请输入年级(0--大一，1--大二，2--大三，3--大四)");
		Scanner in_g=new Scanner(System.in);
		int grade=in_g.nextInt();

		System.out.println("请输入专业");
		Scanner in_m=new Scanner(System.in);
		String major=in_m.next();

		System.out.println("请输入英语四级考试成绩(若不足8次，以-1结束)：");
		Scanner input=new Scanner(System.in);
		int[] cet4_scores=new int[8];

		for(int i=0;i<8;i++){
			int n=input.nextInt();
			if(n!=-1) cet4_scores[i]=n;
			else break;
		}
		Student s=new Student(name,grade,major,cet4_scores);
		s.printInfo();
		s.level_up();
		s.printInfo();
 }
}
