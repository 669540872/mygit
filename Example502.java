public class Example502{
	public static void main(String[] args){
		MyThread myThread=new MyThread();
		myThread.start();
		while(true){
			System.out.println("Main����������");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("MyThread���run()����������");
		}
	}
}