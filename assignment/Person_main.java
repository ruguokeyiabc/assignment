package student;

import java.util.Scanner;

import progammer.Person;

public class Person_main {
	public static void main(String[] args){
	System.out.println("����������");
	Scanner in_s=new Scanner(System.in);
	String name=in_s.next();
	
	System.out.println("�������Ա�");
	Scanner in_g=new Scanner(System.in);
	String gender=in_g.next();
	
	System.out.println("���������");
	Scanner in_h=new Scanner(System.in);
	double heigh=in_h.nextDouble();
	
	System.out.println("����������");
	Scanner in_a=new Scanner(System.in);
	int age=in_a.nextInt();
	
	Person p=new Person(name,gender,age,heigh);
	System.out.println("������"+p.getName());
	System.out.println("���䣺"+p.getAge());
	System.out.println("�Ա�"+p.getGender());
	System.out.println("��ߣ�"+p.getHeigh());
	if(p.canMarry()) System.out.println("���Խ��");
	else System.out.println("���ܽ��");
	}
}