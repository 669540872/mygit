import java.util.Scanner;
public class Example0007 {
    public static void main(String[] args) {
    	double[] cashs = new double[5];
    	double sum = 0.0;
    	System.out.println("�������Ա���µ����Ѽ�¼��");
    	Scanner input = new Scanner(System.in);
    	for(int i=0;i<cashs.length;i++) {
    		System.out.print("�������"+(i+1)+"�ʹ����");
    		cashs[i]=input.nextDouble();
    		sum=sum+cashs[i];
    	}
    	System.out.println("\n���\t\t��Ԫ��");
    	for(int i=0;i<cashs.length;i++) {
    		System.out.println((i+1)+"\t\t"+cashs[i]);
    	}
    	System.out.println("�ܽ��\t\t"+sum);
    }
}
