package package_2;

public class Person {
	Limb[] limb_leg=new Leg[2];
	Limb[] limb_hand=new Hand[2];
	public void printInfo(){
		for(int i=0;i<2;i++){
			System.out.println("第"+(i+1)+"条腿的重量和长度分别为："+limb_leg[i].getWeight()+" "+limb_leg[i].getLength());
			System.out.println("第"+(i+1)+"只胳膊的重量和长度分别为："+limb_hand[i].getLength()+" "+limb_hand[i].getLength());
		}
	}
}
