
import tv.TV;
import tv.HaiSenTV;
import tv.HaiErTV;
import factory.Factory;
import factory.HaiSenFactory;
import factory.HaiErFactory;

public class Utility{
	public static void main(String[] args){
		HaiSenFactory haisenfactory = new HaiSenFactory();
		HaiSenTV haisentv = haisenfactory.createTV();
		
		HaiErFactory haierfactory = new HaiErFactory();
		HaiErTV haiertv = haierfactory.createTV();
	}
}