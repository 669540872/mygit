public class Example503{
	public static void main(String[] args){
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		while(true){
			System.out.println("Main����������");
		}
	}
}
class MyThread implements Runnable{
	public void run(){
		while(true){
			System.out.println("MyThread���run()����������");
		}
	}
}