import java.util.Scanner;
public class Email {
public static void main(String[] args){
	System.out.println("������Email��");
	Scanner in=new Scanner(System.in);
	String postcard=in.next();
	getMatch(postcard);
}
public static void getMatch(String s){
	String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+[.][a-zA-Z0-9_-]+";
	if (s.matches(regex)) System.out.println("��Email�ǺϷ���");
	else System.out.println("��Email�ǲ��Ϸ���");
}
}