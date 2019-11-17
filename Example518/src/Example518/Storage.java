package Example518;

public class Storage {
	private int[] cells=new int[10];
    private int inPos,outPos;
    private int count=0;
    public synchronized void put(int num) {
    	try {
    		while(count==cells.length) {
    			this.wait();
    		}
    		Thread.sleep(50);
    		cells[inPos]=num;
    		System.out.println("��cells["+inPos+"]�з�������----"+cells[inPos]);
    		inPos++;
    		if(inPos==cells.length) {
    			inPos=0;
    		}
    		count++;
    		this.notify();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
     public synchronized void get() {
    	try {
    		while(count==0) {
    			this.wait();
    		}
    		Thread.sleep(50);
    		int date=cells[outPos];
    		System.out.println("��cells["+outPos+"]��ȡ������"+date);
    		outPos++;
    		if(outPos==cells.length) {
    			outPos=0;
    		}
    		count--;
    		this.notify();
    	}catch(Exception e) {
    		e.printStackTrace();
    	} 
    }
}