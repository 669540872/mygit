package Example518;

public class Output implements Runnable{
    private Storage st;
    Output(Storage st){
   	 this.st=st;
    }
    public void run() {
   	 while(true) {
   		 st.get();
   	 }
    }
}