package package_3;

public class arrayMain {
	public static void main(String[] args){
		MyString x=new MyString("abc");
		System.out.println(x.toValue());
		System.out.println(x.length());
		x.reverse();
		System.out.println(x.toValue());
		System.out.println(x.length());
		MyString y=new MyString("AbCd");
		x.concat(y);
		System.out.println(x.toValue());
		y.lower();
		System.out.println(y.toValue());
		y.upper();
		System.out.println(y.toValue());
	}

}
