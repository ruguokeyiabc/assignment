package package_2;

public class Person {
	Limb[] limb_leg=new Leg[2];
	Limb[] limb_hand=new Hand[2];
	public void printInfo(){
		for(int i=0;i<2;i++){
			System.out.println("��"+(i+1)+"���ȵ������ͳ��ȷֱ�Ϊ��"+limb_leg[i].getWeight()+" "+limb_leg[i].getLength());
			System.out.println("��"+(i+1)+"ֻ�첲�������ͳ��ȷֱ�Ϊ��"+limb_hand[i].getLength()+" "+limb_hand[i].getLength());
		}
	}
}
