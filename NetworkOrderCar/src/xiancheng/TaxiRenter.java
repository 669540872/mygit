package xiancheng;

public class TaxiRenter implements Runnable {
    private TaxiBase tb;
    public TaxiRenter(TaxiBase tb){
    	this.tb=tb;
    }
    public void run() {
    	while(true) {
    		tb.go();
    	}
    }
}
