package 字符串的基本操作;

class Example602 {
    public static void main(String[] args) {
    	String s="abcdedcba";
    	System.out.println("字符串的长度："+s.length());
    	System.out.println("字符串中第一个字符："+s.charAt(0));
    	System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
    	System.out.println("字符c最后一次出现的位置："+s.lastIndexOf('c'));
    }
}
