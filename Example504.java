public class Example504{
	public static void main(String[] args){
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
	}
}
class TicketWindow extends Thread{
	private int ticket=100;
	public void run(){
		while(true){
			if(ticket>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在发售第"+ticket--+"张票");
			}
		}
	}
}