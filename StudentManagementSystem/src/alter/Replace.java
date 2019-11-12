package alter;

import java.io.*;
import java.util.Scanner;

import studentStorage.StudentStorage;

public class Replace {
     public StringBuffer run(StringBuffer sb) throws IOException {
    	 System.out.print("请输入要替换的字符的位置：");
    	 Scanner pos=new Scanner(System.in);
    	 int number1=pos.nextInt();
    	 int number2=pos.nextInt();
    	 
    	 System.out.print("请输入要替换的的字符串：");
    	 Scanner sc=new Scanner(System.in);
    	 String s=sc.next();
    	 
    	 sb.replace(number1, number2, s);

		return sb;
     }
}
