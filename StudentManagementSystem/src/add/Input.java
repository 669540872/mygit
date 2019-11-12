package add;

import java.io.*;

import studentStorage.*;

public class Input {
	private StringBuffer sb=new StringBuffer();
	public StringBuffer run(StringBuffer sb) throws IOException {
	    int ch;
	    System.out.println("注意每输入一位学生信息以“；”结尾，以Enter键结束你的输入！");
   	    System.out.print("请输入要添加的学生信息：");
   	    while((ch=System.in.read())!=-1) {
   	  	    if(ch=='\n') {
   			    break;
   		    }
   		    sb.append((char)ch);
   	    }
   	    System.out.println("输入信息成功!");
	 
	return sb; 
	}
}
