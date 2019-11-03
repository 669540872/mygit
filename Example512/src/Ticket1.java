class Ticket1 implements Runnable{
    private int tickets=10;
    Object lock=new Object();
    public void run() {
    	while(tickets>0) {
    		synchronized (lock) {
    			try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			if(tickets>0) {
    				System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
    			}else {
    				break;
    			}
    		}
    	}
    }
}
