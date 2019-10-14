import java.util.*;
public class Example0011 {
    public static void main(String[] args) {
    	char[] chars=new char[9];
    	chars[0]='a';
    	chars[1]='c';
    	chars[2]='u';
    	chars[3]='b';
    	chars[4]='e';
    	chars[5]='p';
    	chars[6]='f';
    	chars[7]='z';
    	System.out.print("原字符序列：");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	Arrays.sort(chars);
    	System.out.print("\n升序排序后：");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	//实现插入字符
    	int index=chars.length;//保存新增成绩插入位置
    	char ch='h';
    	System.out.print("\n待插入字符是："+ch);
    	//找到新元素的插入位置
    	for(int i=0;i<chars.length;i++) {
    		if(ch<chars[i]) {
    			index=i;
    			break;
    		}
    	}
    	//元素后移
    	for(int i=chars.length-1;i>index;i--) {
    		chars[i]=chars[i-1];//index下标开始的元素后移一个位置
    	}
    	chars[index]=ch;
    	System.out.println("插入字符的下标是："+index);
    	System.out.print("插入后的字符序列是：");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    }
}
