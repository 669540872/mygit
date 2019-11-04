import car.*;
import factory.*;
import utility.*;
import xiancheng.*;

public class Main{
	public static void main(String args[]){
		TaxiBase tb=new TaxiBase();
		TaxiProvider taxiProvider=new TaxiProvider(tb);
		TaxiRenter taxiRenter=new TaxiRenter(tb);
		new Thread(taxiProvider).start();
		new Thread(taxiRenter).start();
	}
}
