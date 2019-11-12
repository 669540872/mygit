package alter;

import java.io.IOException;
import java.util.Scanner;

import studentStorage.StudentStorage;

public class SetChar {
		public StringBuffer run(StringBuffer sb) throws IOException {
	    	 System.out.print("请输入要修改字符的位置：");
	    	 Scanner pos=new Scanner(System.in);
	    	 int number=pos.nextInt();
	    	 
	    	 System.out.print("请输入要修改的字符：");
	    	 Scanner sc=new Scanner(System.in);
	    	 String s=sc.next();
	    	 char c=s.charAt(0);
	    	 
	    	 sb.setCharAt(number, c);

		return sb;
     }
}
