package package_1;
public class CarShop {
    public int money;
	public CarShop(){
		money=0;
	}
	public void sellCar(Car c){
		System.out.println("sell a "+c.getName());
		System.out.println("get "+c.getPrice());
		money+=c.getPrice();
	}
	public int getMoney(){
		return money;
	}

}
