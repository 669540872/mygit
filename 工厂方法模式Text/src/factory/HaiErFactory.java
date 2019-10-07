package factory;
import factory.Factory;
import tv.HaiErTV;
public class HaiErFactory implements Factory{
	public HaiErTV createTV(){
		return new HaiErTV();
	}
}