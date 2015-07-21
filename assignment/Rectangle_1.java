package student;
class Rectangle_2 {
	public double length;
	public double wide;
	public String color;
	public Rectangle_2(){
	}
	public Rectangle_2(double length){
		this.length=length;
		this.wide=length;
	}
	public Rectangle_2(double length,String color){
		this.length=length;
		this.wide=length;
		this.color=color;
	}
	public Rectangle_2(double length,double wide,String color){
		this.length=length;
		this.wide=wide;
		this.color=color;
	}
	public double getArea(){
		return length*wide;
	}
	public void printInfo(){
		System.out.println("��Ϊ��"+length);
		System.out.println("��Ϊ��"+wide);
		System.out.println("��ɫΪ��"+color);
		System.out.println("���Ϊ��"+getArea());
	}
}

class Square extends Rectangle_2{
	public Square(double length,String color){
		super(length,color);
	}
}

public class  Rectangle_1{
	public static void main(String[] args){
		System.out.println("������");
		Rectangle_2 rect_1=new Rectangle_2();
		rect_1.printInfo();
		Rectangle_2 rect_2=new Rectangle_2(20);
		rect_2.printInfo();
		Rectangle_2 rect_3=new Rectangle_2(20,"black");
		rect_3.printInfo();
		Rectangle_2 rect_4=new Rectangle_2(20,30,"red");
		rect_4.printInfo();
		System.out.println();
		Square ss=new Square(20,"black");
		ss.printInfo();

	}
}

