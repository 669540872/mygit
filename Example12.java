//������Animal�ӿ�
interface Animal{
	int ID = 1;         //����ȫ�ֱ���
	void breathe();     //������󷽷�breathe()
	void run();         //������󷽷�run()
}
//������LandAnimal�ӿڣ����̳���Animal�ӿ�
interface LandAnimal extends Animal{  //�ӿڼ̳нӿ�
	void liveOnland();                //������󷽷�liveOnland()
}
//����Dog��ʵ��LandAnimal�ӿ�
class Dog implements LandAnimal{
	//ʵ��breathe()����
	public void breathe(){
		System.out.println("���ں���");
	}
	//ʵ��run()����
	public void run(){
		System.out.println("������");
	}
	//ʵ��liveOnland()����
	public void liveOnland(){
		//TODO Auto-generated method stub
		System.out.println("��������½����");
	}
}
//���������
public class Example12{
	public static void main(String args[]){
		Dog dog = new Dog();    //����Dog���ʵ��
		dog.breathe();          //����Dog���breat()�ķ���
		dog.run();              //����Dog���run()����
		dog.liveOnland();       //����Dog���liveOnland()����
	}
}
