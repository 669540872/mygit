import java.util.Scanner;
public class Example0005 {
    public static void main(String[] args) {
    	int[] scores = new int[5];
    	int sum = 0;
    	Scanner input = new Scanner(System.in);
    	System.out.println("请输入5位同学的成绩：");
    	for(int i=0;i<scores.length;i++) {
    		scores[i]=input.nextInt();
    		sum = sum+scores[i];
    	}
    	System.out.println("平均分是："+(double)sum/scores.length);
    }
}
