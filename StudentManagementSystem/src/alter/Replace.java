package alter;

import java.io.*;
import java.util.Scanner;

import studentStorage.StudentStorage;

public class Replace {
     public StringBuffer run(StringBuffer sb) throws IOException {
    	 System.out.print("������Ҫ�滻���ַ���λ�ã�");
    	 Scanner pos=new Scanner(System.in);
    	 int number1=pos.nextInt();
    	 int number2=pos.nextInt();
    	 
    	 System.out.print("������Ҫ�滻�ĵ��ַ�����");
    	 Scanner sc=new Scanner(System.in);
    	 String s=sc.next();
    	 
    	 sb.replace(number1, number2, s);

		return sb;
     }
}
