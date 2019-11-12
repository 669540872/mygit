package remove;

import java.io.IOException;
import java.util.Scanner;

import studentStorage.StudentStorage;
public class DeleteChar {
     public StringBuffer run(StringBuffer sb) throws IOException {
    	 
    	 System.out.print("请输入要删除字符的位置：");
    	 Scanner pos=new Scanner(System.in);
    	 int number=pos.nextInt();
    	 
    	 sb.deleteCharAt(number);
    	 System.out.println("删除成功！");
		return sb;
     }
}
