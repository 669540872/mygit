
import alter.*;

import java.io.IOException;

import add.*;
import find.*;
import remove.*;
import studentStorage.*;

public class Main {
     public static void main(String[] args) throws IOException {
    	    System.out.println("-------------------");
    	    System.out.println("*****欢迎使用！****");
    	    System.out.println("-------------------");
    	    System.out.println("-这里是学生管理系统登录入口-");
    	    System.out.println("请选择您的服务需求!");
         	System.out.println("1.增加学生信息！");
         	System.out.println("2.删除学生信息！");
         	System.out.println("3.更改学生信息！");
         	System.out.println("4.查找学生信息！");
    	    StudentStorage st=new StudentStorage();
    	    st.run();
     }
}
