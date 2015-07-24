package Test;
/*天天是个3岁的小朋友，她有一些不同形状的积木，形状包括长方形，正方形，圆形，三角形四种。某天，天天将自己的积木拿到你的面前，请求你计算下这些积木的总面积。作为大哥哥大姐姐的你如何完成呢？
1. 使用多态
2. 可以将所有的积木的属性在代码中定义，不用输入数据
测试代码：
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

