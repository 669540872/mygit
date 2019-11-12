package add;

import java.io.*;
import java.util.Scanner;

import studentStorage.*;

public class Add {
	
	private StudentStorage st;
	public Add(StudentStorage st){
		this.st=st;
	}
	
     public StringBuffer	 run(StringBuffer sb) throws IOException{
    	 
    	 System.out.println("请选择学生信息添加方式：1.自动添加！2.插入添加！");
    	 Scanner put=new Scanner(System.in);
    	 int num=put.nextInt();
    	 
    	 Input input=new Input();
    	 Intervene intervene=new Intervene();
    	 
    	 switch(num) {
    	 case 1:
    		 input.run(sb);
    		 break;
    	 case 2:
    		 intervene.run(sb);
    		 break;
    	 default:
    		 System.out.println("输入的数字不正确，请重新输入！");
    		 break;
    	 }
	 return sb;
     }
}
