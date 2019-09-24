//定义Animal类
class Animal{
	//定义Animal类无参的构造方法
	public Animal(){
		System.out.println("我是一只动物");
	}
	//定义Animal类有参的构造方法
	public Animal(String name){
		System.out.println("我是一只"+name);
	}
}
//定义Dog类继承Animal类
class Dog extends Animal{
	//定义Dog类无参的构造方法
	public Dog(){
		//方法体中无代码
	}
	//定义Dog类有参的构造方法
/**	public Dog(){
		super("沙皮狗");     //调用父类有参的构造方法
	}*/
}
//定义测试类
public class Example05{
	public static void main(String[] args){
		Dog dog = new Dog();     //实例化子类Dog对象
	}
}