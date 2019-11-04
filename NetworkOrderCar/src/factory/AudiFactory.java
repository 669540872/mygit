package factory;
import car.*;
//import factory.*;
public class AudiFactory implements Factory{
	public Car produceCar() {
   	 return new Audi();
    }
}
