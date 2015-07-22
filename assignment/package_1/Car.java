package package_1;
public abstract class Car {
	    public String name;
	    public int price;
	    public Car(String name,int price){
	    	this.name=name;
	    	this.price=price;
	    }
	   
        public abstract String getName();
		public abstract int getPrice();
		
}
