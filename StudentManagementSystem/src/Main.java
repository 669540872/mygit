
import alter.*;

import java.io.IOException;

import add.*;
import find.*;
import remove.*;
import studentStorage.*;

public class Main {
     public static void main(String[] args) throws IOException {
    	    System.out.println("-------------------");
    	    System.out.println("*****��ӭʹ�ã�****");
    	    System.out.println("-------------------");
    	    System.out.println("-������ѧ������ϵͳ��¼���-");
    	    System.out.println("��ѡ�����ķ�������!");
         	System.out.println("1.����ѧ����Ϣ��");
         	System.out.println("2.ɾ��ѧ����Ϣ��");
         	System.out.println("3.����ѧ����Ϣ��");
         	System.out.println("4.����ѧ����Ϣ��");
    	    StudentStorage st=new StudentStorage();
    	    st.run();
     }
}
