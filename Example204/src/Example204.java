class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String stuName) {
		name=stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int stuAge) {
		if(stuAge<=0) {
			System.out.println("���䲻�Ϸ�......");
		}else {
			age=stuAge;
		}
	}
	public void introduce() {
		System.out.println("��Һá�����"+name+"���ҽ���"+age+"���ˣ�");
	}
}
public class Example204 {
    public static void main(String[] args) {
    	Student stu=new Student();
    	stu.setAge(-30);
    	stu.setName("�");
    	stu.introduce();
    }
}
