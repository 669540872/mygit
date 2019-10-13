import java.util.Scanner;
public class Example0007 {
    public static void main(String[] args) {
    	double[] cashs = new double[5];
    	double sum = 0.0;
    	System.out.println("请输入会员本月的消费记录：");
    	Scanner input = new Scanner(System.in);
    	for(int i=0;i<cashs.length;i++) {
    		System.out.print("请输入第"+(i+1)+"笔购物金额：");
    		cashs[i]=input.nextDouble();
    		sum=sum+cashs[i];
    	}
    	System.out.println("\n序号\t\t金额（元）");
    	for(int i=0;i<cashs.length;i++) {
    		System.out.println((i+1)+"\t\t"+cashs[i]);
    	}
    	System.out.println("总金额\t\t"+sum);
    }
}
