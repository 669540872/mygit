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
    	System.out.print("ԭ�ַ����У�");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	Arrays.sort(chars);
    	System.out.print("\n���������");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	//ʵ�ֲ����ַ�
    	int index=chars.length;//���������ɼ�����λ��
    	char ch='h';
    	System.out.print("\n�������ַ��ǣ�"+ch);
    	//�ҵ���Ԫ�صĲ���λ��
    	for(int i=0;i<chars.length;i++) {
    		if(ch<chars[i]) {
    			index=i;
    			break;
    		}
    	}
    	//Ԫ�غ���
    	for(int i=chars.length-1;i>index;i--) {
    		chars[i]=chars[i-1];//index�±꿪ʼ��Ԫ�غ���һ��λ��
    	}
    	chars[index]=ch;
    	System.out.println("�����ַ����±��ǣ�"+index);
    	System.out.print("�������ַ������ǣ�");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    }
}
