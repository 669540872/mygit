class Person{
	void say() {
		System.out.println("����һ���ˣ�");
	}
}
public class Example201 {
   public static void main(String[] args) {
	   Person p2 = new Person();
	   p2.say();
	   p2=null;
	   p2.say();
   }
}
