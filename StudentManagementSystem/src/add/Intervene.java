package add;

import java.io.*;
import java.util.Scanner;

import studentStorage.*;

public class Intervene {
     public StringBuffer run(StringBuffer sb) throws IOException {
    	 String ss=sb.toString();
    	 boolean buer;
    	 buer=ss.isEmpty();
    	 if(buer==true) {
    		 System.out.println("此字符串为空串，请选择自动添加！");
    	 }
    	 
    	 System.out.print("请输入要插入字符串的位置：");
    	 Scanner pos=new Scanner(System.in);
    	 int number=pos.nextInt();
    	 
    	 System.out.println("注意输入每一个学生成员之后再输入“;”，以Enter键结束输入！");
    	 
    	 System.out.print("请输入要插入的字符串：");
    	 StringBuffer sr=new StringBuffer();
    	 int ch;
    	 while((ch=System.in.read())!=-1) {
    		 if(ch=='\n') {
    			 break;
    		 }
    		 sr.append((char)ch);
    	 }
    	 sb.insert(number,sr);
    	 
	 return sb;
    	 
     }
}
