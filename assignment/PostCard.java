import java.util.*;
public class PostCard {
public static void main(String[] args){
	System.out.println("请输入邮政编码：");
	Scanner in=new Scanner(System.in);
	String postcard=in.next();
	getMatch(postcard);
}
public static void getMatch(String s){
	String regex = "[0-9]{6}";
	if (s.matches(regex)) System.out.println("该邮政编码是合法的");
	else System.out.println("该邮政编码是不合法的");
}
}