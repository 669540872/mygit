package 字符串的转化操作;

class Example603 {
     public static void main(String[] args) {
    	 String str="abcd";
    	 System.out.println("将字符串转为字符数组后的结果：");
    	 char[] charArray=str.toCharArray();
    	 for(int i=0;i<charArray.length;i++) {
    		 if(i!=charArray.length-1) {
    			 System.out.print(charArray[i]+",");
    		 }else {
    			 System.out.println(charArray[i]);
    		 }
    	 }
    	 System.out.println("将int值转换为String类型之后的结果："+String.valueOf(12));
    	 System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
     }
}
