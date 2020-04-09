package atv01;

public class ClasseThread implements Runnable {
	
	
	private String texto;
	private long intervalo;
	
	public ClasseThread(String texto, long intervalo) {
		this.texto = texto;
		this.intervalo = intervalo;
	}
	

	@Override
	public void run() {
		for(char c: texto.toCharArray()) {
			System.out.println(c);
			try {
				Thread.sleep(intervalo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
