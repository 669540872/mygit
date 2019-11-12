package remove;

import java.io.IOException;

import studentStorage.StudentStorage;

public class Clear {
	public StringBuffer run(StringBuffer sb) throws IOException {
   	 
   	 sb.delete(0,sb.length());
   	 System.out.println("清楚缓冲区成功！");
		return sb;
     }
}
