import java.util.Scanner;
public class Example0005 {
    public static void main(String[] args) {
    	int[] scores = new int[5];
    	int sum = 0;
    	Scanner input = new Scanner(System.in);
    	System.out.println("������5λͬѧ�ĳɼ���");
    	for(int i=0;i<scores.length;i++) {
    		scores[i]=input.nextInt();
    		sum = sum+scores[i];
    	}
    	System.out.println("ƽ�����ǣ�"+(double)sum/scores.length);
    }
}
