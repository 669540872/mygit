import java.util.Scanner;
public class Example0008 {
    public static void main(String[] args) {
    	double[] shuzu=new double[5];
    	Scanner input=new Scanner(System.in);
    	double max = 0.0;
    	System.out.println("������5λͬѧ�ĳɼ���");
    	for(int i=0;i<shuzu.length;i++) {
    		shuzu[i] = input.nextDouble();
    	}
    	for(int j=0;j<shuzu.length;j++){
    		if(shuzu[j]>max) {
    			max=shuzu[j];
    		}
    	}
    	System.out.println("��5λͬѧ����߳ɼ�Ϊ��"+max);
    }
}
