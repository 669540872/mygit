package �ַ�����ת������;

class Example603 {
     public static void main(String[] args) {
    	 String str="abcd";
    	 System.out.println("���ַ���תΪ�ַ������Ľ����");
    	 char[] charArray=str.toCharArray();
    	 for(int i=0;i<charArray.length;i++) {
    		 if(i!=charArray.length-1) {
    			 System.out.print(charArray[i]+",");
    		 }else {
    			 System.out.println(charArray[i]);
    		 }
    	 }
    	 System.out.println("��intֵת��ΪString����֮��Ľ����"+String.valueOf(12));
    	 System.out.println("���ַ���ת���ɴ�д֮��Ľ����"+str.toUpperCase());
     }
}
