package Example515;

public class Example515 {
	public static void main(String[] ages) {
		Storage st=new Storage();
        Input input=new Input(st);
        Output output=new Output(st);
        new Thread(input).start();
        new Thread(output).start();
	}
     
}