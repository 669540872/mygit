package Runtime;

public class Example614 {
     public static void main(String[] args) throws Exception{
    	 Runtime rt=Runtime.getRuntime();
    	 Process process=rt.exec("notepad.exe");
    	 Thread.sleep(3000);
    	 process.destroy();
     }
}
