class YielThread extends Thread{
	public YielThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==3){
				System.out.print("线程让步：");
				Thread.yield();
			}
		}
	}
}
public class Example509{
	public static void main(String[] args){
		Thread t1=new YielThread("线程A");
		Thread t2=new YielThread("线程B");
		t1.start();
		t2.start();
	}
}