class YieldThread implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==3){
				System.out.print("�߳��ò���");
				Thread.yield();
			}
		}
	}
}
public class Example513{
	public static void main(String[] args){
		YieldThread yt=new YieldThread();
		new Thread(yt,"�߳�A").start();
		new Thread(yt,"�߳�B").start();
	}
}