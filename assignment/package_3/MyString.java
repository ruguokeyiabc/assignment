package package_3;

public class MyString {
	private char[] ch;
	public MyString(String str){
		this.ch=str.toCharArray();
	}
    //ת��ΪString
	public String toValue(){
		String s="";
		for(char c:ch){
			s+=c;
		}
		return s;
	}
    //ȡ����
	public int length(){
		int cnt=0;
		for(char c:ch){
			if(c!=('\0')) cnt++;
			else break;
		}
		return cnt;
	}
	//���ַ�����ת
	public void reverse(){
		char[] a=new char[this.length()];
		for(int i=this.length()-1;i>=0;i--){
			a[this.length()-1-i]=ch[i];
		}
	   this.ch=a; 
}
	//�����ַ���
	public void concat(MyString x){
		String ss=this.toValue()+x.toValue();
		this.ch=ss.toCharArray();
	}
	//ת��ΪСд
	public void lower(){
		for(int i=0;i<this.length();i++){
			if(ch[i]>64&&ch[i]<91) ch[i]+=32;
			else if(ch[i]>96&&ch[i]<123) continue;
			else break;
		}
	}
	//ת��Ϊ��д
	public void upper(){
		for(int i=0;i<this.length();i++){
			if(ch[i]>64&&ch[i]<91) continue;
			else if(ch[i]>96&&ch[i]<123) ch[i]-=32;
			else break;
		}
	}
	
	

}
