package package_1;
public class Test_main {
  public static void main(String[] args) {
	CarShop shop=new CarShop();
	shop.sellCar(new QQ("x1",30000));
	shop.sellCar(new BMW("x2",300000));
	System.out.println("Sale income:"+shop.getMoney());
	}

}
