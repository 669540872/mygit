package find;

import studentStorage.StudentStorage;

import java.io.IOException;
import java.util.Scanner;

public class Find {
	
	  private StudentStorage st;
	  public Find(StudentStorage st){
		  this.st=st;
	  }
	    
      public void run(StringBuffer sb) throws IOException {
    	  String st=sb.toString();
    	  String[] cells=st.split("��");
    	  System.out.println("��������Ҫ��ѯ��ѧ������Ϣ��");
    	  Scanner sc=new Scanner(System.in);
    	  String ss=sc.next();
    	  
    	  for(int i=0;i<cells.length;i++) {
    		  boolean j;
    		  j=cells[i].equals(ss);
    		  if(j==true) {
    			  System.out.println(cells[i]);
    		  }
    	  }
      }
}
