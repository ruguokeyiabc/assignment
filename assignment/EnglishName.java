import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EnglishName {
public static void main(String[] args){
	System.out.println("������Ӣ�����֣�");
	Scanner in=new Scanner(System.in);
	String englishName=in.nextLine();
	getMatch(englishName);
}
public static void getMatch(String s){
	//Pattern p=Pattern.compile("[A-Z][a-z]+\\s+[A-Z][a-z]+");
	//Matcher m=p.matcher(s);
	//boolean b=m.matches();
	String regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";
	String regex1 = "[A-Z][a-z]+\\s+[A-Z][a-z]*\\s+[A-Z][a-z]+";
	if (s.matches(regex)||s.matches(regex1)) System.out.println("��Ӣ�������ǺϷ���");
	else System.out.println("��Ӣ�������ǲ��Ϸ���");
}
}