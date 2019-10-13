import java.util.Arrays;
public class Example0009 {
    public static void main(String[] args) {
    	char[] chars=new char[] {'a','c','u','b','e','p','f','z'};
    	System.out.print("Ô­×Ö·ûÐòÁÐ£º");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	Arrays.sort(chars);
    	System.out.print("\nÉýÐòÅÅÐòºó£º");
    	for(int i=0;i<chars.length;i++) {
    		System.out.print(chars[i]+" ");
    	}
    	System.out.print("\nÄæÐòÅÅÐòºó£º");
    	for(int i=chars.length-1;i>=0;i--) {
    		System.out.print(chars[i]+" ");
    	}
    }
}
