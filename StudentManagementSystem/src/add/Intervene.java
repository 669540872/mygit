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
    		 System.out.println("���ַ���Ϊ�մ�����ѡ���Զ���ӣ�");
    	 }
    	 
    	 System.out.print("������Ҫ�����ַ�����λ�ã�");
    	 Scanner pos=new Scanner(System.in);
    	 int number=pos.nextInt();
    	 
    	 System.out.println("ע������ÿһ��ѧ����Ա֮�������롰;������Enter���������룡");
    	 
    	 System.out.print("������Ҫ������ַ�����");
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
