package progammer;
public class Student {
	private String name;
	private int grade;
	private String major;
	private int[] cet4_scores;
	public Student(String name, int grade,  String major, int[] cet4_scores){
		this.name=name;
		this.grade=grade;
		this.major=major;
		this.cet4_scores=cet4_scores;
	}

	public  int level_up(){
		return grade++;
	}

	public  boolean passed_cet4(){
		boolean b=false;
		if(cet4_scores.length!=0){
			for(int i=0;i<cet4_scores.length-1;i++){
				if(cet4_scores[i]>=425){
					b=true;break;
				}
			}
		}
		return b;
	}
	public void printInfo(){
		System.out.println("������"+name);
		System.out.println("רҵ��"+major);
		switch(grade){
		case 0:System.out.println("���һ��");break;
		case 1:System.out.println("������");break;
		case 2:System.out.println("�������");break;
		case 3:System.out.println("�����ϱ�ҵ��");break;
		default:System.out.println("��������");
		}
		if(passed_cet4()) System.out.println("ͨ��cet4");
		else System.out.println("û��ͨ��cet4");
	}
}

