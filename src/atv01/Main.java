package atv01;

public class Main {

	public static void main(String[] args) {
		
		ClasseThread cls = new ClasseThread("nao consigo mais", 500);
		ClasseThread cls1 = new ClasseThread("quero acabar isso logo", 1000);
		ClasseThread cls2 = new ClasseThread("provinha dificil", 2000);
		Thread th1 = new Thread(cls);
		Thread th2 = new Thread(cls1);
		Thread th3 = new Thread(cls2);

		th1.start();
		th2.start();
		th3.start();

	}

}
