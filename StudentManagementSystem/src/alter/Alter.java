package alter;

import java.io.*;
import java.util.Scanner;

import studentStorage.*;

public class Alter{
	
	private StudentStorage st;
	public Alter(StudentStorage st){
		this.st=st;
	}

	public StringBuffer run(StringBuffer sb) throws IOException{
    	 
    	 System.out.println("��ѡ��ѧ����Ϣ��ӷ�ʽ��1.�Զ���ӣ�2.������ӣ�");
    	 Scanner put=new Scanner(System.in);
    	 int num=put.nextInt();
    	 
    	 SetChar setChar=new SetChar();
    	 Replace replace=new Replace();
    	 
    	 switch(num) {
    	 case 1:
    		 setChar.run(sb);
    		 break;
    	 case 2:
    		 replace.run(sb);
    		 break;
    	 default:
    		 System.out.println("��������ֲ���ȷ�����������룡");
    		 break;
    	 }
	 return sb;
     }
}