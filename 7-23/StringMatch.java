package package_1;

public class StringMatch{
	private String str;
	private char[] ch;
	//���췽��
	public  StringMatch(String str){
		this.str=str;
	} 
	//���ַ�x��str�г��ֵĴ���
	public int numberOfOccurence(char x){
		ch=str.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==(x)){
				cnt++;
			} 
			else continue;
		}
		return cnt;
	}

	private static boolean isSame(String s) {
		char a = s.charAt(0);
		for(char c : s.toCharArray()){
			if (a != c)
				return false;
		}
		return true;
	}

	//��str�г��ִ�������ҳ���Ϊlen����С���ַ���
	public String getMaxSubStr(int len){
		ch=str.toCharArray();
		String min =null;

		try{for(int i=0;i<ch.length;i++){
			String s="";
			for(int j=i;j<i+len;j++){
				if(i+len<ch.length)
					s+=ch[j];
			}
			//System.out.println(s);
			if (isSame(s)){
				if (min==null){
					min = s;
				}
				else{
					if (s.charAt(0)<min.charAt(0)){
						min = s;
					}
				}
			}
		}
		}catch(Exception h){
		}
		return min;



	}
}


