package xiancheng;

import car.*;
import factory.*;
import utility.*;

public class TaxiBase {
     private Car[] cars=new Car[10];
     private int inPos,outPos;
     private int count=0;
     
     public TaxiBase() {
    	 Factory factory=(Factory)XMLUtil.getBean();
		 for(int i=0;i<10;i++) {
			 cars[i]=factory.produceCar();
		 }
     }
     
     public synchronized void come() {
    	 try {
    		 
    		 while(count==cars.length) {
    			 this.wait();
    		 }
    		 
    		 System.out.println("����"+inPos+"��"+cars[inPos].toString()+"��⣡");
    		 inPos++;
    		 
    		 if(inPos==cars.length) {
    			 inPos=0;;
    		 }
    		 
    		 count++;
    		 Thread.sleep(1000);
    		 this.notify();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
     public synchronized void go(){
    	 try {
    		 
    		 while(count==0) {
    			 this.wait();
    		 }
    		 
    //		 Car kongwei;
    	//	 Car date=cars[outPos];
    		 
    		 System.out.println("����"+outPos+cars[outPos].toString()+"���⣬�Ʒѷ���"+cars[outPos].getRatio());
    	//	 cars[outPos]=kongwei;
    		 outPos++;
    		 
    		 if(count==0) {
    			 outPos=0;
    		 }
    		 count--;
    		 Thread.sleep(1000);
    		 this.notify();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
}