package remove;

import java.io.IOException;

import studentStorage.StudentStorage;

public class Clear {
	public StringBuffer run(StringBuffer sb) throws IOException {
   	 
   	 sb.delete(0,sb.length());
   	 System.out.println("����������ɹ���");
		return sb;
     }
}
