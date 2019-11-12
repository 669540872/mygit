package remove;

import java.io.*;
import java.util.Scanner;

import studentStorage.*;

public class Remove {
	
     private StudentStorage st;
     public Remove(StudentStorage st){
    	 this.st=st;
     }
     
     public StringBuffer run(StringBuffer sb) throws IOException{
    	 
    	 System.out.println("请选择学生信息删除方式：1.删除指定位置的字符！2.删除指定范围的字符！");
    	 Scanner put=new Scanner(System.in);
    	 int num=put.nextInt();
    	 
    	 DeleteChar deleteChar=new DeleteChar();
    	 Delete delete=new Delete();
    	 Clear claer=new Clear();
    	 
    	 switch(num) {
    	 case 1:
    		 deleteChar.run(sb);
    		 break;
    	 case 2:
    		 delete.run(sb);
    		 break;
    	 case 3:
    		 claer.run(sb);
    		 break;
    	 default:
    		 System.out.println("输入的数字不正确，请重新输入！");
    		 break;
    	 }
	 return sb;
     }
}
