package factory;
import car.*;
//import factory.*;
public class BenzFactory implements Factory{
	public Car produceCar() {
   	 return new Benz();
    }
}
