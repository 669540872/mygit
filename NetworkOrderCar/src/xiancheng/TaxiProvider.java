package xiancheng;

public class TaxiProvider implements Runnable {
    private TaxiBase tb;
    public TaxiProvider(TaxiBase tb){
    	this.tb=tb;
    }
    public void run() {
    	while(true) {
    		tb.come();
    	}
    }
}
