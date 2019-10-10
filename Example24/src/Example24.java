
public class Example24 {
   public static void main(String[] args) {
	   int sum=getSum(12);
	   System.out.println("sum="+sum);
   }
   public static int getSum(int n) {
	   if(n==1) {
		   return 1;
	   }
	   int temp=getSum(n-1);
	   return temp+n;
   }
}
