import java.util.*;
public class PostCard {
public static void main(String[] args){
	System.out.println("�������������룺");
	Scanner in=new Scanner(System.in);
	String postcard=in.next();
	getMatch(postcard);
}
public static void getMatch(String s){
	String regex = "[0-9]{6}";
	if (s.matches(regex)) System.out.println("�����������ǺϷ���");
	else System.out.println("�����������ǲ��Ϸ���");
}
}