class Person{
	int age;
	public Person(int a) {
		age=a;
	}
	public void speak() {
		System.out.println("�ҽ���"+age+"���ˣ�");
	}
}
public class Example205 {
    public static void main(String[] args) {
    	Person p=new Person(20);
    	p.speak();
    }
}
