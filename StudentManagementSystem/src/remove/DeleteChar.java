package remove;

import java.io.IOException;
import java.util.Scanner;

import studentStorage.StudentStorage;
public class DeleteChar {
     public StringBuffer run(StringBuffer sb) throws IOException {
    	 
    	 System.out.print("������Ҫɾ���ַ���λ�ã�");
    	 Scanner pos=new Scanner(System.in);
    	 int number=pos.nextInt();
    	 
    	 sb.deleteCharAt(number);
    	 System.out.println("ɾ���ɹ���");
		return sb;
     }
}
