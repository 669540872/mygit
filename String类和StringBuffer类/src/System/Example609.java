package System;
import java.util.*;
public class Example609 {
     public static void main(String[] args) {
    	 Properties properties=System.getProperties();
    	 Enumeration propertyNames=properties.propertyNames();
    	 while(propertyNames.hasMoreElements()) {
    		 String key=(String)propertyNames.nextElement();
    		 String value=System.getProperty(key);
    		 System.out.println(key+"--->"+value);
    	 }
     }
}
