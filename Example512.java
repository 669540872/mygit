public class Example512{
	public static void main(String[] args) throws Exception{
		SleepThread st=new SleepThread();
		st.start();
		for(int i=1;i<=10;i++){
			if(i==5){
				Thread.sleep(2000);
			}
			System.out.println("���߳����������"+i);
			Thread.sleep(500);
		}
	}
}
class SleepThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i==3){
				try{
					Thread.sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println("�߳�һ���������"+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}