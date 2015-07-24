package TestTwo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class ArrayMain {
	public static int N=1000;
	public static void main(String[] args)throws IOException{
		FileReader text=new FileReader("E:\\test.txt");
		BufferedReader is= new BufferedReader(text);
		String s=is.readLine();
		ArrayList<String> arr=new ArrayList<String>();
		arr.add(Amatch(s));
		int[] cnt=new int[N];
		int j=0;
		int k=1;
		String[] string=new String[N];
		string[j]=arr.get(j);
		for(int i=1;i<arr.size();i++){
			for(int r=0;r<=j;r++){}
			if(string[j].equals(arr.get(i))) {cnt[k]++; continue;}
			else {
				j++;
				string[j]=arr.get(i);
			}
		}

		System.out.println(test(arr,cnt));
	}
	private static String test(ArrayList<String> arr, int[] cnt) {
		double[] a=new double[arr.size()];
		String[] str=new String[]{"am","is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"};
		for(int i=0;i<arr.size();i++){
			for(int k=0;k<str.length;k++){
				if(arr.get(i).equals(str[k])) a[i]=cnt[i]*0.2;
				else a[i]=cnt[i];
			}
		}
		int max=0;
		for(int rr=1;rr<arr.size();rr++){
			if(a[max]<a[rr]){
				int t=rr;
				rr=max;
				max=t;
			}
		}
		return arr.get(max);	
	}
	
	private static String Amatch(String s) {
		String regex="[^a-zA-Z]([a-zA-Z])[^a-zA-Z]";   
		String regex1="^([a-zA-Z])[^a-zA-Z]";
		String regex2="[^a-zA-Z]([a-zA-Z])$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(s.matches(regex)||s.matches(regex1)||s.matches(regex2)){
			matches= m.group(0);
		}
		return  matches;
}
	}
	
	



   



