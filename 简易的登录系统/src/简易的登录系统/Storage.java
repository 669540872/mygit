package ���׵ĵ�¼ϵͳ;

class Storage {
     private String[] cells=new String[100];
     private int inPos,outPos;
     private int count;
     
     public synchronized void put(int num,int sleepSecond) {
    	 try {
    		 
    		 while(count==cells.length) {
    			 this.wait();
    		 }
    		 cells[inPos]=String.valueOf(num);
    		 System.out.println("��"+inPos+"λ�û�"+cells[inPos]+"���ڵ�½��");
    		 inPos++;
    		 if(inPos==cells.length) {
    			 inPos=0;
    		 }
    		 count++;
    		 System.out.println("��ϵͳ����"+count+"λ�û����ߣ�");
    		 Thread.sleep(sleepSecond);
    		 this.notify();
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
     public synchronized void get(int sleepSecond) {
    	 try {
    		 while(count==0) {
    			 this.wait();
    		 }
    		 String date="abc";
    		 System.out.println("��"+outPos+"λ�û�"+cells[outPos]+"����ע����");
    		 cells[outPos]=date;
    		 outPos++;
    		 if(outPos==cells.length) {
    			 outPos=0;
    		 }
    		 System.out.println("��ϵͳ�й���"+count--+"λ�û����ߣ�");
    		 Thread.sleep(1000);
    		 this.notify();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
}
