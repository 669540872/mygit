public class GetPrize {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   System.out.print("输入张浩的JAVA成绩：");
	   int score = input.nextlnt();
	   if(score>90) {
		   System.out.println("老师说：不错，奖励一个MP4！");
	   }
   }
}
