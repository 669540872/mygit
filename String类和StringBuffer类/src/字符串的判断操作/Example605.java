package �ַ������жϲ���;

public class Example605 {
     public static void main(String[] args) {
    	 String s1="String";
    	 String s2="Str";
    	 System.out.println("�ж��Ƿ����ַ���str��ͷ��"+s1.startsWith("Str"));
    	 System.out.println("�ж��Ƿ����ַ���ng��β��"+s1.endsWith("ng"));
    	 System.out.println("�ж��Ƿ�����ַ���tri��"+s1.contains("tri"));
    	 System.out.println("�ж��ַ����Ƿ�Ϊ�գ�"+s1.isEmpty());
    	 System.out.println("�ж������ַ����Ƿ����"+s1.equals(s2));
    	 String str1=new String("abc");
    	 String str2=new String("abc");
    	 System.out.println(str1==str2);
    	 System.out.println(str1.equals(str2));
     }
}
