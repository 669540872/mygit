package System;

public class Example610 {
     public static void main(String[] args) {
    	 long startTime=System.currentTimeMillis();
    	 int sum=0;
    	 for(int i=0;i<100000000;i++) {
    		 sum+=i;
    	 }
    	 long endTime=System.currentTimeMillis();
    	 System.out.println("�������е�ʱ��:"+(endTime-startTime)+"����!");
     }
}
