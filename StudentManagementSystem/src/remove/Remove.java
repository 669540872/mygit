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
    	 
    	 System.out.println("��ѡ��ѧ����Ϣɾ����ʽ��1.ɾ��ָ��λ�õ��ַ���2.ɾ��ָ����Χ���ַ���");
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
    		 System.out.println("��������ֲ���ȷ�����������룡");
    		 break;
    	 }
	 return sb;
     }
}
