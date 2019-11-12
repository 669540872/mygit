package 字符串的判断操作;

public class Example605 {
     public static void main(String[] args) {
    	 String s1="String";
    	 String s2="Str";
    	 System.out.println("判断是否以字符串str开头："+s1.startsWith("Str"));
    	 System.out.println("判断是否以字符串ng结尾："+s1.endsWith("ng"));
    	 System.out.println("判断是否包含字符串tri："+s1.contains("tri"));
    	 System.out.println("判断字符串是否为空："+s1.isEmpty());
    	 System.out.println("判断两个字符串是否相等"+s1.equals(s2));
    	 String str1=new String("abc");
    	 String str2=new String("abc");
    	 System.out.println(str1==str2);
    	 System.out.println(str1.equals(str2));
     }
}
