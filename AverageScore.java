import java.util.*;
public class AverageScore {
	public static double averageScore(ArrayList<Integer>scores){
		double sum=0;
		for(int i=0;i<scores.size();i++){
			sum+=scores.get(i);
		}
		return sum/scores.size();	

		/*double sum=0;
		for(Integer x:scores){
			sum+=x;
		}
		return sum/scores.size();*/

		/*double sum=0;
		int i=0;
		while(i<scores.size()){
			sum+=scores.get(i);
			i+=1;
		}
		return sum/scores.size();*/

		/*double sum=0;
		int i=0;
		do{sum+=scores.get(i);
		i++;
		}while(i<scores.size());
		return sum/scores.size();*/
	}
	
	public static void main(String[] args){
		Scanner sca=new Scanner(System.in);
		double s=0;
		int m=0;
		ArrayList<Integer>scores=new ArrayList<Integer>();
		System.out.println("要输出平均值请输入-1");
		System.out.print("请输入成绩:");

		do{	
			Scanner sca1=new Scanner(System.in);
			m=sca1.nextInt();
			scores.add(m);
			if(m==-1)
				System.out.println(s);
			else s=averageScore(scores);

		}while(m!=-1);

	}

}

