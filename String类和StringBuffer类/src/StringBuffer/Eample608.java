package StringBuffer;

public class Eample608 {
    public static void main(String[] args) {
    	System.out.println("1.添加-------------");
    	add();
    	System.out.println("2.删除-------------");
    	remove();
    	System.out.println("3.修改-------------");
    	alter();
    }
    public static void add() {
    	StringBuffer sb=new StringBuffer();
    	sb.append("abcdefg");
    	System.out.println("append添加结果："+sb);
    	sb.insert(2, "123");
    	System.out.println("insert添加结果："+sb);
    }
    public static void remove() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.delete(1, 5);
    	System.out.println("删除指定位置结果："+sb);
    	sb.deleteCharAt(2);
    	System.out.println("删除指定位置结果："+sb);
    	sb.delete(0, sb.length());
    	System.out.println("清空缓冲区结果："+sb);
    }
    public static void alter() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.setCharAt(1, 'p');
    	System.out.println("修改指定位置字符结果："+sb);
    	sb.replace(1, 3, "qq");
    	System.out.println("修改指定位置字符(串)结果："+sb);
    	System.out.println("翻转字符串结果："+sb.reverse());
    }
}
