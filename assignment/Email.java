import java.util.Scanner;
public class Email {
public static void main(String[] args){
	System.out.println("请输入Email：");
	Scanner in=new Scanner(System.in);
	String postcard=in.next();
	getMatch(postcard);
}
public static void getMatch(String s){
	String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+[.][a-zA-Z0-9_-]+";
	if (s.matches(regex)) System.out.println("该Email是合法的");
	else System.out.println("该Email是不合法的");
}
}