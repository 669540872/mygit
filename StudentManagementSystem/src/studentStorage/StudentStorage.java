package studentStorage;

import alter.*;
import add.*;
import find.*;
import remove.*;

import java.io.*;
import java.util.*;

public class StudentStorage {
     private StringBuffer sb=new StringBuffer();
     
     private StudentStorage st;
     public StudentStorage(){
    	 this.st=st;
     }
     
     public void run() throws IOException {
    	 
    	 Add add=new Add(st);
    	 Remove remove=new Remove(st);
    	 Alter alter=new Alter(st);
    	 Find find=new Find(st);
    	 
    	 System.out.print("请输入你的选择：");
    	 Scanner num=new Scanner(System.in);
    	 int number=num.nextInt();
    	 
    	 switch(number) {
    	 case 1:
    		 add.run(sb);
    		 break;
    	 case 2:
    		 remove.run(sb);
    		 break;
    	 case 3:
    		 alter.run(sb);
    		 break;
    	 case 4:
    		 find.run(sb);
    		 break;
    	 default:
    		 System.out.println("你输入的数字有误，请重新输入！");
    		 break;
    	 }
    	 
     }
}
