package progammer;

public class Person {
private String name;
private String gender;
private int age;
private double heigh;
public Person(String name,String gender,int age,double heigh){
	this.name=name;
	this.gender=gender;
	this.age=age;
	this.heigh=heigh;
}
	public String getName(){
		return name;
	}
	public String getGender(){
		if(gender==null) return "Unknow";
		else if(gender.equals("M")) return "Male";
		else if(gender.equals("F")) return "Female";
		else return "Unknow";
	}
	public int getAge(){
		return age;
	}
	public double getHeigh(){
		return heigh;
	}
	public boolean canMarry(){
		if((gender.equals("M")&&age>=22)||(gender.equals("F")&&age>=20))
			return true;
		else return false;
	}
}
