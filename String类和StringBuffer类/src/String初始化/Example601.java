package String��ʼ��;

class Example601 {
    public static void main(String[] args) throws Exception{
    	String str1=new String();
    	String str2=new String("abcd");
    	char[] charArray=new char[] {'D','E','F'};
    	String str3=new String(charArray);
    	System.out.println("a"+str1+"b");
    	System.out.println(str2);
    	System.out.println(str3);
    }
}
