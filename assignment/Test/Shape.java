package Test;
/*�����Ǹ�3���С���ѣ�����һЩ��ͬ��״�Ļ�ľ����״���������Σ������Σ�Բ�Σ����������֡�ĳ�죬���콫�Լ��Ļ�ľ�õ������ǰ���������������Щ��ľ�����������Ϊ�����������������أ�
1. ʹ�ö�̬
2. ���Խ����еĻ�ľ�������ڴ����ж��壬������������
���Դ��룺
ArrayList shapes = new ArrayList();
shapes.add(new XXX());
System.out.println("Total Area:" + getTotalArea(shapes));
*/

public abstract class Shape {
	 public double length;
	 public double width;
	 public double radious;
	 public double size;
	 public Shape(double length,double width){
		 this.length=length;
		 this.width=width;
	 }
	 public Shape(double radious){
		 this.radious=radious;
	 }
	 public Shape(double length,double width,double size){
		 this.length=length;
		 this.width=width;
		 this.size=size;
	 }
	 public abstract double getArea();

}

