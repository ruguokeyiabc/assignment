package package_2;

public class Main {
	public static void main(String[] args){
		Person person=new Person();
		person.limb_leg[0]=new Leg(34,56);
		person.limb_leg[1]=new Leg(33,55);
		person.limb_hand[0]=new Hand(50,45);
		person.limb_hand[1]=new Hand(51,46);
		person.printInfo();

	}

}
