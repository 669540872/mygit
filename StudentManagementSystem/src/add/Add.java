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
    	 
    	 System.out.println("��ѡ��ѧ����Ϣ��ӷ�ʽ��1.�Զ���ӣ�2.������ӣ�");
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
    		 System.out.println("��������ֲ���ȷ�����������룡");
    		 break;
    	 }
	 return sb;
     }
}
