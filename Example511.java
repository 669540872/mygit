public class Example511{
	public static void main(String[] args){
		Thread min=new MinPriority("Min");
		Thread max=new MaxPriority("Max");
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(10);
		min.start();
		max.start();
	}
}
class MinPriority extends Thread{
	public MinPriority(String name){
		super(name);
	}
	public void run(){
		for(int i=1;i<=10;i++){
			Thread min=Thread.currentThread();
			String min_name=min.getName();
			System.out.println(min_name+"正在运行："+i);
		}
	}
}
class MaxPriority extends Thread{
	public MaxPriority(String name){
		super(name);
	}
	public void run(){
		for(int i=1;i<=10;i++){
			Thread max=Thread.currentThread();
			String max_name=max.getName();
			System.out.println(max_name+"正在运行："+i);
		}
	}
}