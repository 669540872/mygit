package alter;

import java.io.IOException;
import java.util.Scanner;

import studentStorage.StudentStorage;

public class SetChar {
		public StringBuffer run(StringBuffer sb) throws IOException {
	    	 System.out.print("������Ҫ�޸��ַ���λ�ã�");
	    	 Scanner pos=new Scanner(System.in);
	    	 int number=pos.nextInt();
	    	 
	    	 System.out.print("������Ҫ�޸ĵ��ַ���");
	    	 Scanner sc=new Scanner(System.in);
	    	 String s=sc.next();
	    	 char c=s.charAt(0);
	    	 
	    	 sb.setCharAt(number, c);

		return sb;
     }
}
