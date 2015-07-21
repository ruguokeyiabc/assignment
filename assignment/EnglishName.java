import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EnglishName {
public static void main(String[] args){
	System.out.println("请输入英文名字：");
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
	if (s.matches(regex)||s.matches(regex1)) System.out.println("该英文名字是合法的");
	else System.out.println("该英文名字是不合法的");
}
}