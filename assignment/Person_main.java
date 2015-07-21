package student;

import java.util.Scanner;

import progammer.Person;

public class Person_main {
	public static void main(String[] args){
	System.out.println("请输入姓名");
	Scanner in_s=new Scanner(System.in);
	String name=in_s.next();
	
	System.out.println("请输入性别");
	Scanner in_g=new Scanner(System.in);
	String gender=in_g.next();
	
	System.out.println("请输入身高");
	Scanner in_h=new Scanner(System.in);
	double heigh=in_h.nextDouble();
	
	System.out.println("请输入年龄");
	Scanner in_a=new Scanner(System.in);
	int age=in_a.nextInt();
	
	Person p=new Person(name,gender,age,heigh);
	System.out.println("姓名："+p.getName());
	System.out.println("年龄："+p.getAge());
	System.out.println("性别："+p.getGender());
	System.out.println("身高："+p.getHeigh());
	if(p.canMarry()) System.out.println("可以结婚");
	else System.out.println("不能结婚");
	}
}