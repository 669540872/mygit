//����Animal��
class Animal{
	String name = "����";
	//���嶯��еķ���
	void shout(){
		System.out.println("���﷢������");
	}
}
//����Dog��̳ж�����
class Dog extends Animal{
	String name = "Ȯ��";
	//��д���׵�shout()����
	void shout(){       //���ʸ���ĳ�Ա����
		super.shout();
		System.out.println("����.......");
	}
	//�����ӡname�ķ���
	void printName(){
		System.out.println("name = "+super.name);//���ʸ���ĳ�Ա����
		System.out.println("name = "+name);
	}
}
//���������
public class Example0000{
	public static void main(String[] args){
		Dog dog = new Dog();//����һ��Dog����
		dog.shout();        //����dog������д��shout()����
		dog.printName();    //����dog�����printName()����
	}
}