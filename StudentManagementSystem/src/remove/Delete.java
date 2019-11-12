package remove;

import java.io.IOException;
import java.util.Scanner;

import studentStorage.StudentStorage;

public class Delete {
	public StringBuffer run(StringBuffer sb) throws IOException {
		System.out.print("请输入要删除字符的位置：");
   	 Scanner pos=new Scanner(System.in);
   	 int number1=pos.nextInt();
   	 int number2=pos.nextInt();
   	 
   	 sb.delete(number1,number2);
   	 System.out.println("删除成功！");
		return sb;
     }
}
