package student;
import java.util.*;
import progammer.Student;
public class Student_main{
	public static void main(String[] args){
		System.out.println("����������");
		Scanner in_s=new Scanner(System.in);
		String name=in_s.next();

		System.out.println("�������꼶(0--��һ��1--�����2--������3--����)");
		Scanner in_g=new Scanner(System.in);
		int grade=in_g.nextInt();

		System.out.println("������רҵ");
		Scanner in_m=new Scanner(System.in);
		String major=in_m.next();

		System.out.println("������Ӣ���ļ����Գɼ�(������8�Σ���-1����)��");
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
