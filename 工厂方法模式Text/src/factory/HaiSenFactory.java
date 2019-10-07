package factory;
import factory.Factory;
import tv.HaiSenTV;
public class HaiSenFactory implements Factory{
	public HaiSenTV createTV(){
		return new HaiSenTV();
	}
}