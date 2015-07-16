import java.io.*;
import java.util.*;
public class Text {

	//得到要处理的具体位置
	public static String getAdress(ArrayList<String>address){
		String s="";
		String sss="abc";
		String[] arr=new String[4];
		char m;
		int k=0;
		for(int i=0;i<address.size();i++)
			s = s+address.get(i);
		if(s.length()<4){  return sss;
		}
		else {
			for(int j=s.length()-1;j>=s.length()-4;j--){
				m=s.charAt(j);
				arr[k]=String.valueOf(m);
				k++;
			}
			if(arr[0].equals("t")&&arr[1].equals("x")&&arr[2].equals("t")&&arr[3].equals(".")) {
				return s;
			}
			else return sss;
		} 
	}

	//创建文件
	public static void creatText()throws IOException{
		ArrayList<String>address =new ArrayList<String>();
		String m="";
		do{System.out.println("please input the address you want to create:");
		Scanner sca1=new Scanner(System.in);
		m=sca1.next();
		address.add(m);
		}while(getAdress(address).equals("abc"));

		File file=new File(getAdress(address));
		boolean is_succ=file.createNewFile();
		if(is_succ){
			System.out.println(getAdress(address)+" has been created!");
		}
		else{
			System.out.println(getAdress(address)+" already exists!");
		}	
	}

	//写文件
	public static void writeTest()throws IOException{
		ArrayList<String>address =new ArrayList<String>();
		String m="";
		do{System.out.println("please input the address you want to create:");
		Scanner sca1=new Scanner(System.in);
		m=sca1.next();
		address.add(m);
		}while(getAdress(address).equals("abc"));
        File file=new File(getAdress(address));
		OutputStream os=new FileOutputStream(file);
		System.out.println("please input some thing.");
		Scanner in=new Scanner(System.in);
		String cont=in.next();
		for(int i=0;i<cont.length();i++){
			char x=cont.charAt(i);//返回指定索引处的 char 值
			os.write(x);
		}
		os.close();
		System.out.println("content has been written to file.");
	}

	//读文件
	public static void readText()throws IOException{
		ArrayList<String>address =new ArrayList<String>();
		String m="";
		do{System.out.println("please input the address you want to create:");
		Scanner sca1=new Scanner(System.in);
		m=sca1.next();
		address.add(m);
		}while(getAdress(address).equals("abc"));
        File file=new File(getAdress(address));
		FileReader fr = new FileReader(file);  
		int ch = 0;    
		while((ch = fr.read())!=-1 ){    
			System.out.print( (char)ch );    
		}  
	}

	//删除文件
	public static void deleteText(){
		ArrayList<String>address =new ArrayList<String>();
		String m="";
		do{System.out.println("please input the address you want to create:");
		Scanner sca1=new Scanner(System.in);
		m=sca1.next();
		address.add(m);
		}while(getAdress(address).equals("abc"));
        File file=new File(getAdress(address));
		boolean is_succ=file.delete();
		if(is_succ){
			System.out.println( getAdress(address)+" has been deleted.");
		}
		else{
			System.out.println(getAdress(address)+" has not been deleted.");
		}
	}

	public static void main(String[] args) throws IOException{
		String nm;
		do{System.out.println("please input a value. 1--creattext 2--writetext 3--readtext 4--deletetext");
		Scanner sca=new Scanner(System.in);
		int signal=sca.nextInt();
		switch(signal){
		case 1:creatText();break;
		case 2:writeTest();break;
		case 3:readText();break;
		case 4:deleteText();break;
		}
		System.out.println("\ncontinue? yes--y no--n");
		Scanner s=new Scanner(System.in);
		nm=s.next();

		}while(nm.equals("y"));
	}
}
