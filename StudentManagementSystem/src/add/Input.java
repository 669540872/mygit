package add;

import java.io.*;

import studentStorage.*;

public class Input {
	private StringBuffer sb=new StringBuffer();
	public StringBuffer run(StringBuffer sb) throws IOException {
	    int ch;
	    System.out.println("ע��ÿ����һλѧ����Ϣ�ԡ�������β����Enter������������룡");
   	    System.out.print("������Ҫ��ӵ�ѧ����Ϣ��");
   	    while((ch=System.in.read())!=-1) {
   	  	    if(ch=='\n') {
   			    break;
   		    }
   		    sb.append((char)ch);
   	    }
   	    System.out.println("������Ϣ�ɹ�!");
	 
	return sb; 
	}
}
