package atv02;

public class CalculaRaizCubica implements Runnable {

	@Override
	public void run() {
		for(int i = 2; i <= 1000;i++ ) {
			if(i%2 == 0) {
				System.out.println(Math.cbrt(i));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
